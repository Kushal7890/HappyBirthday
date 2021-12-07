package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast: Unit =
            Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        // It will show a message on the screen
        // then onStart is invoked
        val toast  = Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        // It will show a message on the screen
        // then onResume is invoked
        val toast = Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        // It will show a message on the screen
        // then onPause is invoked
        val toast = Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        // It will show a message on the screen
        // then onStop is invoked
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        // It will show a message on the screen
        // then onRestart is invoked
        val toast = Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        // It will show a message on the screen
        // then onDestroy is invoked
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
    }

}