package com.twq.w7_day4_mvvm.view.myProfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.textfield.TextInputLayout
import com.twq.w7_day4_mvvm.R

class ProfileUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_user)


        var usrenameProfile=findViewById<TextInputLayout>(R.id.usrenameProfile)
        var emailProfile=findViewById<TextInputLayout>(R.id.emailProfile)
        var idProfile=findViewById<TextInputLayout>(R.id.idProfile)
        var imageView3profile= findViewById<ImageView>(R.id.imageView3profile)
        var button2Save= findViewById<Button>(R.id.button2Save)

    }
}