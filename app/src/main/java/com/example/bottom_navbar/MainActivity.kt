package com.example.bottom_navbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replace(Home())
        bottom_navbar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> replace(Home())
                R.id.location -> replace(Location())
                R.id.menu_book -> replace(Book())
            }
            true
        }
    }
    //this function replaces the fragment container with suitable fragment
    private fun replace(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.commit()
    }
}