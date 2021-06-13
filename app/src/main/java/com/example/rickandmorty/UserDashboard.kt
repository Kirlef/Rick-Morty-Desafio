package com.example.rickandmorty

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import model.userModel
import androidx.navigation.NavController
import com.example.rickandmorty.R

class UserDashboard : AppCompatActivity() {


    private lateinit var navigationController: NavController

    private lateinit var mAuth : FirebaseAuth
    private lateinit var mAuthStateListener : FirebaseAuth.AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_dashboard)
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        this.navigationController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, navigationController)

        val button: Button = findViewById(R.id.logout_button)
        //Logout Button
        button.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val loginIntent = Intent(this, Lobby::class.java)
            startActivity(loginIntent)
        }



    }
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController, null)
    }
}