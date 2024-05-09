package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
//Criação da variável binding que servirá para manipular a tela.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Infla o layout da atividade usando a classe de binding gerada automaticamente.
        binding = ActivityLoginBinding.inflate(layoutInflater)

// Define o layout da atividade como a raiz do layout inflado.
        setContentView(binding.root)

// Configura um listener de clique para o botão de entrada.
        binding.buttonEntrar.setOnClickListener {

            // Extrai o texto dos campos de nome de usuário e senha e remove espaços em branco extras.
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            // Verifica se o nome de usuário é "abc" e a senha é "123".
            if (username.equals("abc") && password.equals("123")) {
                // Se as credenciais forem corretas, cria um Intent para abrir a MainActivity.
                val i = Intent(this, MainActivity::class.java)
                // Adiciona o nome de usuário como um extra para o Intent.
                i.putExtra("username", username)
                // Inicia a MainActivity e finaliza a atividade de login.
                startActivity(i)
                finish()
            } else {
                // Se as credenciais não forem corretas, exibe um Toast indicando o erro.
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
        }

    }
}