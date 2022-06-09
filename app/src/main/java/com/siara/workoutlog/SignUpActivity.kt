package com.siara.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {

    lateinit var etFirstName: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var etConfirm: TextInputEditText
    lateinit var etLastName: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var tilFirstName: TextInputLayout
    lateinit var tilLastName: TextInputLayout
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var tilConfirm:TextInputLayout
    lateinit var btnSignUp: Button
    lateinit var etLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etFirstName = findViewById(R.id.etFirstname)
        etLastName = findViewById(R.id.etLastName)
        etConfirm = findViewById(R.id.etConfirm)
        tilFirstName=findViewById(R.id.tilFirstName)
        tilLastName = findViewById(R.id.tilLastname)
        tilConfirm = findViewById(R.id.Confirm)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword = findViewById(R.id.tilPassword)
        btnSignUp = findViewById(R.id.btnSignup)
        etLogin = findViewById(R.id.etLogin)


        btnSignUp.setOnClickListener {
            validate()

        }
    }
    fun validate (){
        var error=false
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var Confirm = etConfirm.text.toString()

        if (email.isBlank()){
            tilEmail.error= "email Required"
            error=true
        }
        if (password.isBlank()){
            tilPassword.error="email Required"
            error=true
        }
        if (Confirm.isBlank()){
            tilConfirm.error="Confirmation error"
            error=true
        }
        if(password!=Confirm){
            tilConfirm.error="Confirmation error"
            error=true
        }
    }

}