package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Chama a implementação da superclasse do método onCreate para configurar o estado da atividade.
        super.onCreate(savedInstanceState)

// Define o layout da atividade como o layout "activity_splash".
        setContentView(R.layout.activity_splash)

// Cria um manipulador para postar uma ação a ser executada após um atraso de 2000 milissegundos (2 segundos).
        Handler(Looper.getMainLooper()).postDelayed({

            // Obtém o Intent que iniciou esta atividade.
            val i = intent

            // Cria um novo Intent para iniciar a atividade PedidoActivity.
            val j = Intent(this,PedidoActivity::class.java)

            // Adiciona todos os extras do Intent atual para o novo Intent.
            j.putExtras(i)

            // Inicia a atividade PedidoActivity com o novo Intent.
            startActivity(j)

// Define o atraso de 2000 milissegundos (2 segundos) antes de executar o código dentro desta lambda.
        },2000)


    }
}