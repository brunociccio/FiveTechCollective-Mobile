package br.com.fivetechcolletive.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fivetechcolletive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o botão para ir para a Página 2
        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this, PaginaDois::class.java)
            startActivity(intent)
        }
    }
}



