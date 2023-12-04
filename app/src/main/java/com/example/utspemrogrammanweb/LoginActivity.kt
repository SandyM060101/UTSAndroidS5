package com.example.utspemrogrammanweb

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var mUsername: EditText
    private lateinit var mPassword: EditText
    private lateinit var mBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mUsername = findViewById(R.id.username)
        mPassword = findViewById(R.id.password)
        mBtn = findViewById(R.id.button)

        mBtn.setOnClickListener {
            val username = mUsername.text.toString()
            val password = mPassword.text.toString()

            if (isValidCredentials(username, password)) {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {
                showErrorMessage("Username or Password Salah")
            }
        }

        val textViewRegister = findViewById<TextView>(R.id.registrasi)

        // Set OnClickListener untuk TextView
        textViewRegister.setOnClickListener {
            // Intent untuk berpindah ke halaman registrasi
            val intent = Intent(this, RegistrasiActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        return username == "Admin" && password == "123"
    }

    private fun showErrorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    @SuppressLint("MissingSuperCall")
    @Deprecated("Deprecated in Java", ReplaceWith("finishAffinity()"))
    override fun onBackPressed() {
        finishAffinity() // Menutup seluruh aplikasi
    }
}
