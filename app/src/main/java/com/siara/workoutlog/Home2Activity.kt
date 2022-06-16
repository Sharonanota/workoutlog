package com.siara.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.siara.workoutlog.databinding.ActivityHome2Binding
import com.siara.workoutlog.databinding.ActivitySignUpBinding

class Home2Activity : AppCompatActivity() {
    lateinit var binding: ActivityHome2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        setupBottomNav()


    }

    fun setupBottomNav(){
        binding.bottomNav.setOnItemSelectedListener { item->
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