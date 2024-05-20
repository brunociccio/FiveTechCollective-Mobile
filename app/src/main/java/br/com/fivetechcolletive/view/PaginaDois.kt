package br.com.fivetechcolletive.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fivetechcolletive.databinding.ActivityPage2Binding

class PaginaDois : AppCompatActivity() {
    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para voltar para MainActivity
        binding.buttonToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Configurando o botão para ir para a PaginaTres
        binding.buttonToPage3.setOnClickListener {
            val intent = Intent(this, PaginaTres::class.java)
            startActivity(intent)
        }
    }
}


