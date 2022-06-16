package com.siara.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.siara.workoutlog.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var  binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()


    }
    fun castView(){


        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


       binding.btnLogIn.setOnClickListener {
            validate()
            startActivity(Intent(this, Home2Activity::class.java))
        }
    }
    fun validate (){
        var email = binding.etEmail.text.toString()
        var error = false
        var password = binding.etPassword.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmail.error = "Not a valid email adddress"
            error = true
        }

        if (email.isBlank()){
            binding.tilEmail.error= "email Required"
            error=true
        }
        if (password.isBlank()){
            binding.tilPassword.error="email Required"
            error=true
        }

    }
}