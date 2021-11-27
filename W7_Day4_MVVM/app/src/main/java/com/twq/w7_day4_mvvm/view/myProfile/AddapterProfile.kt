package com.twq.w7_day4_mvvm.view.myProfile

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputLayout
import com.squareup.picasso.Picasso
import com.twq.w7_day4_mvvm.R
import com.twq.w7_day4_mvvm.model.User
import retrofit2.http.Url

class AddapterProfile(var data:MutableList<User>):RecyclerView.Adapter<ProfileHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileHolder {
        var v =LayoutInflater.from(parent.context).inflate(R.layout.row_profile,parent,false)
        return ProfileHolder(v)
    }

    override fun onBindViewHolder(holder: ProfileHolder, position: Int) {

        holder.textView4email.text=data[position].email
        holder.textView2username.text=data[position].username
        holder.textView3id.text=data[position].id
        holder.imageView4edit.setOnClickListener {
           var i = Intent()

            holder.itemView.context.startActivity(i)

        }

        Picasso.get().load(data[position].photo).into(holder.imageView2)
    }

    override fun getItemCount(): Int {

        return data.size
    }
}

class ProfileHolder(v: View):RecyclerView.ViewHolder(v){

   var textView2username=v.findViewById<TextView>(R.id.textView2username)
    var textView3id=v.findViewById<TextView>(R.id.textView3id)
    var textView4email=v.findViewById<TextView>(R.id.textView4email)
    var imageView2 = v.findViewById<ImageView>(R.id.imageView2)
    var imageView4edit= v.findViewById<ImageView>(R.id.imageView4edit)

}