package com.example.rickandmorty

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import model.userModel

class signup : Fragment() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var refUsers: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.fragment_signup, container, false)
        val button = view.findViewById<Button>(R.id.login_redirect)
        button.setOnClickListener { loginRedirect(view) }
        val signupButton = view.findViewById<Button>(R.id.login_button)
        signupButton.setOnClickListener { user_signup(view) }
        return view
    }

    fun loginRedirect(view:View){
        view.findNavController().navigate(R.id.action_signup_to_login)
    }

    @SuppressLint("CutPasteId")
    fun user_signup(view:View)
    {
        val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(requireView().windowToken, 0)

        val username = view.findViewById<EditText>(R.id.signup_username).text.toString().trim()
        val password = view.findViewById<EditText>(R.id.signup_password).text.toString().trim()
        val email = view.findViewById<EditText>(R.id.signup_email).text.toString().trim()

        if(username.isEmpty())
        {
            view.findViewById<EditText>(R.id.signup_username).error = "Please enter a username"
            return
        }

        if(email.isEmpty())
        {
            view.findViewById<EditText>(R.id.signup_email).error = "Please enter your email"
            return
        }

        if(password.isEmpty())
        {
            view.findViewById<EditText>(R.id.signup_password).error = "Please enter a password"
            return
        }

        val user = userModel("1234", username, email)
        registerUser(user, password)

    }

    private fun registerUser(user: userModel, password:String) {
        mAuth = FirebaseAuth.getInstance()
        mAuth.createUserWithEmailAndPassword(user.email, password).addOnCompleteListener{task->
            if(task.isSuccessful) {

                FirebaseAuth.getInstance().currentUser?.let {
                    user.id=it.uid
                    FirebaseDatabase.getInstance().getReference("Users").child(it.uid).setValue(user)
                        .addOnCompleteListener{task->
                            if(task.isSuccessful) {
                                requireView().findNavController().navigate(R.id.action_signup_to_login)
                                Toast.makeText(activity, "Sign Up Successful!", Toast.LENGTH_SHORT).show()

                            }
                            else{
                                Toast.makeText(activity, "Unsuccessful :(", Toast.LENGTH_SHORT).show()

                            }
                        }
                }

            }
            else{
                Toast.makeText(activity, "Please check your email and password!", Toast.LENGTH_SHORT).show()

            }

        }

    }

}