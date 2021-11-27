package com.twq.w7_day4_mvvm.view.myProfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.twq.w7_day4_mvvm.R
import com.twq.w7_day4_mvvm.model.User

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        var myRecyclerView=findViewById<RecyclerView>(R.id.myRecyclerView)


        var listProfile= mutableListOf<User>()

    }
}