package com.example.permissionsdemo

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCameraPermssion.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "You already have Access", Toast.LENGTH_SHORT).show()
            }
            else{
                // Request Permission
            }
        }
    }

    companion object{
        // This is my Personal variable to allow camera and Location permission access
        private const val CAMERA_PERMISSION_CODE =1
        private const val FINE_ACESS__PERMISSION_CODE =1

    }
}