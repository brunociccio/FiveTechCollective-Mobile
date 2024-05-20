package br.com.fivetechcolletive.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fivetechcolletive.databinding.ActivityPage5Binding

class PaginaCinco : AppCompatActivity() {
    private lateinit var binding: ActivityPage5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para voltar para PaginaQuatro
        binding.buttonToPage4.setOnClickListener {
            val intent = Intent(this, PaginaQuatro::class.java)
            startActivity(intent)
        }
    }
}
