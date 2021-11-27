package com.twq.w7_day4_mvvm.view.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import com.twq.w7_day4_mvvm.R
import com.twq.w7_day4_mvvm.databinding.ActivityLoginBinding
import com.twq.w7_day4_mvvm.view.home.HomeActivity
import com.twq.w7_day4_mvvm.view.myProfile.ProfileActivity
import com.twq.w7_day4_mvvm.view.registeration.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityLoginBinding.inflate(layoutInflater)

        val vm:LoginViewModel by viewModels()

        binding.imageView3rew.setOnClickListener {
            var i=Intent(this,ProfileActivity::class.java)
            startActivity(i)
        }

        binding.buttonLogin.setOnClickListener {

            vm.login(binding.tinputUsername.text.toString(),binding.textInputPassword.text.toString())
                .observe(this,{
                    if(it){
                        startActivity(Intent(this,HomeActivity::class.java))
                    }else{

                        Log.d("login","wrong username or password")
                        Toast.makeText(this, "Wrong username or password!", Toast.LENGTH_SHORT).show()
                    }
                })
        }
        setContentView(binding.root)

        binding.textViewRegister.setOnClickListener{
// intent to registrActivity
            var i = Intent(this,RegisterActivity::class.java)
            startActivity(i)

        }


    }
}