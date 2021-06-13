package com.example.rickandmorty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.rickandmorty.di.appModule
import com.example.rickandmorty.di.networkModule
import com.google.firebase.auth.FirebaseAuth
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import java.util.*
import android.app.Application
import android.content.pm.ActivityInfo

class MainActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestedOrientation =  (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main)

        startKoin {
            androidContext(this@MainActivity)
            modules(listOf(networkModule, appModule))
        }

        mAuth = FirebaseAuth.getInstance()
        val user=mAuth.currentUser

        Timer().schedule(object : TimerTask() {
            override fun run() {

                if(user!=null)
                {
                    startActivity(Intent(applicationContext, UserDashboard::class.java))
                }
                else
                {
                    startActivity(Intent(applicationContext, Lobby::class.java))
                }



            }
        }, 2000)



    }
}