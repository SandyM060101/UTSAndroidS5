package com.example.utspemrogrammanweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KalkulatorActivity : AppCompatActivity() {
    private lateinit var angkaPertama : EditText
    private lateinit var angkaKedua : EditText
    private lateinit var Tambah : Button
    private lateinit var Kurang : Button
    private lateinit var Kali : Button
    private lateinit var Bagi : Button
    private lateinit var Hasil : TextView
    private lateinit var HargaAsli : EditText
    private lateinit var Diskon : EditText
    private lateinit var ButtonTotal : Button
    private lateinit var HasilTotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        angkaPertama = findViewById(R.id.angkapertama)
        angkaKedua = findViewById(R.id.angkakedua)
        Tambah = findViewById(R.id.tambah)
        Kurang = findViewById(R.id.kurang)
        Kali = findViewById(R.id.kali)
        Bagi = findViewById(R.id.bagi)
        Hasil = findViewById(R.id.hasilKali)

        Tambah.setOnClickListener {
            val angka1 = angkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = angkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 + angka2

            Hasil.text = hasil.toString()
        }
        Kurang.setOnClickListener {
            val angka1 = angkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = angkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 - angka2

            Hasil.text = hasil.toString()
        }
        Kali.setOnClickListener {
            val angka1 = angkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = angkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 * angka2

            Hasil.text = hasil.toString()
        }
        Bagi.setOnClickListener {
            val angka1 = angkaPertama.text.toString().trim().toIntOrNull() ?: 0
            val angka2 = angkaKedua.text.toString().trim().toIntOrNull() ?: 0
            val hasil = angka1 / angka2

            Hasil.text = hasil.toString()
        }

        HargaAsli = findViewById(R.id.hargaasli)
        Diskon = findViewById(R.id.diskon)
        ButtonTotal = findViewById(R.id.buttontotal)
        HasilTotal = findViewById(R.id.hasiltotal)

        ButtonTotal.setOnClickListener {
            val harga = HargaAsli.text.toString().trim().toIntOrNull()?:0
            val diskon = Diskon.text.toString().trim().toIntOrNull()?:0
            val total = harga - (harga * diskon /100)

            HasilTotal.text = total.toString()
        }
    }
}