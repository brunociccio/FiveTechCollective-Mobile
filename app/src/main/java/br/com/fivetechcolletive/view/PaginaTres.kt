package br.com.fivetechcolletive.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fivetechcolletive.databinding.ActivityPage3Binding

class PaginaTres : AppCompatActivity() {
    private lateinit var binding: ActivityPage3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para voltar para PaginaDois
        binding.buttonToPage2.setOnClickListener {
            val intent = Intent(this, PaginaDois::class.java)
            startActivity(intent)
        }
    }
}
