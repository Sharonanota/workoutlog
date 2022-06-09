package com.siara.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bottom_nav:BottomNavigationView
    lateinit var fcvHome:FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        castview()
        setupBottomNav()


    }
    fun castview(){
        bottom_nav=findViewById(R.id.bottom_nav)
        fcvHome=findViewById(R.id.fcvHome)
    }
    fun setupBottomNav(){
        bottom_nav.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                   supportFragmentManager.beginTransaction().replace(R.id.fcvHome,planFragment()).commit()
                    true
                }
                R.id.track->{

                    var transaction=   supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else->false
            }
        }
    }
}