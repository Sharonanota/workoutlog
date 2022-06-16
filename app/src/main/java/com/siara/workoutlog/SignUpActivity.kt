package com.siara.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.siara.workoutlog.databinding.ActivityLoginBinding
import com.siara.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)




        binding.btnSignup.setOnClickListener {
            validate()

        }
    }
    fun validate (){
        var error=false
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var Confirm = binding.etConfirm.text.toString()

        if (email.isBlank()){
            binding.tilEmail.error= "email Required"
            error=true
        }
        if (password.isBlank()){
            binding.tilPassword.error="email Required"
            error=true
        }
        if (Confirm.isBlank()){
            binding.Confirm.error="Confirmation error"
            error=true
        }
        if(password!=Confirm){
            binding.Confirm.error="Confirmation error"
            error=true
        }
        if (!error){

        }
    }

}