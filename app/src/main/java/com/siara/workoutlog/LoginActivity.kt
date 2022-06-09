package com.siara.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tvSignUp: TextView
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castView()


    }
    fun castView(){
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword = findViewById(R.id.tilPassword)
        tvSignUp = findViewById(R.id.tvSignUp)
        btnLogin = findViewById(R.id.btnLogIn)

        tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


        btnLogin.setOnClickListener {
            validate()
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
    fun validate (){
        var email = etEmail.text.toString()
        var error = false
        var password = etPassword.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilEmail.error = "Not a valid email adddress"
            error = true
        }

        if (email.isBlank()){
            tilEmail.error= "email Required"
            error=true
        }
        if (password.isBlank()){
            tilPassword.error="email Required"
            error=true
        }

    }
}