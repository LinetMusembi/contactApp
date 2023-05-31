package com.example.contactappassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            // Create a list of contacts
            val contacts = mutableListOf(
                ContactData(firstName = "Lynet ", email = "johndoe@example.com", phoneNumber = "+254789453", imageResId = R.drawable.avatar),
                ContactData(firstName = "Irene", email = "irenemusembi@gmail.com", phoneNumber = "+2567894532", imageResId = R.drawable.avatar),
                ContactData("Mercy","yvonne@gmail.com","0785645342", imageResId = R.drawable.avatar),
                ContactData(firstName = "Ann", email = "annkelly@gmail.com", phoneNumber = "07546362345", imageResId = R.drawable.avatar ),
                ContactData(firstName = "Willy", email = "willysifuna@gmail.com", phoneNumber = "075649384", imageResId = R.drawable.avatar),
                ContactData(firstName = "Eunice", email = "eunicemusembi@gmai.com", phoneNumber = "0798032356", imageResId = R.drawable.avatar)


            )

            // Create a recycler view and set the adapter
            val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = ContactRvAdapter(contacts)
        }
    }


