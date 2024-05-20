package br.com.fivetechcolletive.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fivetechcolletive.databinding.ActivityPage4Binding

class PaginaQuatro : AppCompatActivity() {
    private lateinit var binding: ActivityPage4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para voltar para PaginaTres
        binding.buttonToPage3.setOnClickListener {
            val intent = Intent(this, PaginaTres::class.java)
            startActivity(intent)
        }

        // Configurando o botão para ir para a PaginaCinco
        binding.buttonToPage5.setOnClickListener {
            val intent = Intent(this, PaginaCinco::class.java)
            startActivity(intent)
        }
    }
}