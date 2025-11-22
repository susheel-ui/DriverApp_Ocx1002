package com.example.ocx_1001_driverapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ocx_1001_driverapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var  binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this, Otp_VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.IncludedLayoutLanguage.searchCloseBtn.setOnClickListener {
            binding.LanguageSelectorListView.visibility = View.GONE
        }
        binding.IncludedLayoutLanguage.LanguageSelectorLayoutListView.setOnItemClickListener { parent, view, position, id ->
            when (id) {
                0L -> {
                    Toast.makeText(this, "English", Toast.LENGTH_SHORT).show()
                    binding.LanguageSelectorListView.visibility = View.GONE
                }

                1L -> {
                    Toast.makeText(this, "हिंदी", Toast.LENGTH_SHORT).show()
                    binding.LanguageSelectorListView.visibility = View.GONE
                }
                2L -> {
                    Toast.makeText(this, "தமிழ்", Toast.LENGTH_SHORT).show()
                    binding.LanguageSelectorListView.visibility = View.GONE
                }

            }
        }

    }
}