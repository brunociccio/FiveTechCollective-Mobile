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

        // Configurando o botão no primeiro bloco branco para ir para PaginaTres
        binding.buttonInWhiteBlock1.setOnClickListener {
            val intent = Intent(this, PaginaTres::class.java)
            startActivity(intent)
        }

        // Configurando o botão no segundo bloco branco para ir para PaginaQuatro
        binding.buttonInWhiteBlock2.setOnClickListener {
            val intent = Intent(this, PaginaQuatro::class.java)
            startActivity(intent)
        }

        // Configurando o botão no terceiro bloco branco para ir para PaginaCinco
        binding.buttonInWhiteBlock3.setOnClickListener {
            val intent = Intent(this, PaginaCinco::class.java)
            startActivity(intent)
        }

    }
}



