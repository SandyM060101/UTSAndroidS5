package com.example.utspemrogrammanweb

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistrasiActivity : AppCompatActivity() {
    private lateinit var npmMahasiswaa : EditText
    private lateinit var namaMahasiswaa : EditText
    private lateinit var usernameMahasiswa : EditText
    private lateinit var passwordMahasiswa : EditText
    private lateinit var btnRegis : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        npmMahasiswaa = findViewById(R.id.npmMahasiswa)
        namaMahasiswaa = findViewById(R.id.namaMahasiswa)
        usernameMahasiswa = findViewById(R.id.username)
        passwordMahasiswa = findViewById(R.id.password)
        btnRegis = findViewById(R.id.button)

        btnRegis.setOnClickListener {
            val npmValue = npmMahasiswaa.text.toString()
            val namaValue = namaMahasiswaa.text.toString()

            val hasilNPM = findViewById<TextView>(R.id.npmTampil)
            hasilNPM.text = npmValue
            val hasilNAMA = findViewById<TextView>(R.id.namaTampil)
            hasilNAMA.text = namaValue
        }

        val textViewRegister = findViewById<TextView>(R.id.login)

        // Set OnClickListener untuk TextView
        textViewRegister.setOnClickListener {
            // Intent untuk berpindah ke halaman registrasi
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        finishAffinity() // Menutup seluruh aplikasi
    }
}