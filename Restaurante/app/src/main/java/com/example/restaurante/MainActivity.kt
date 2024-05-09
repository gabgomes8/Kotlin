package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Infla o layout da MainActivity usando a classe de binding gerada automaticamente.
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Chama a implementação da superclasse do método onCreate para configurar o estado da atividade.
        super.onCreate(savedInstanceState)

        // Define o layout da atividade como a raiz do layout inflado.
        setContentView(binding.root)

        // Extrai o nome de usuário do Intent que iniciou esta atividade, se existir.
        val username = intent.extras?.getString("username")

        // Verifica se o nome de usuário não está vazio ou nulo e configura a saudação correspondente.
        if (!username.isNullOrEmpty()) {
            binding.textOla.setText("Olá $username")
        }

        // Configura um listener de clique para o botão de fechar, que finaliza a atividade atual e todas as suas instâncias.
        binding.buttonFechar.setOnClickListener {
            finishAffinity()
        }

        // Configura um listener de clique para o botão de pedir, que inicia a SplashActivity e envia dados extras sobre os pedidos de comida.
        binding.buttonPedir.setOnClickListener {
            val i = Intent(this, SplashActivity::class.java)
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.text.toString())
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.text.toString())
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.text.toString())
            startActivity(i)
            finish()
        }

        // Configura um listener de clique para a caixa de seleção de pizza, que ajusta a visibilidade do campo de quantidade e preço.
        binding.checkPizza.setOnClickListener {
            if (binding.checkPizza.isChecked()) {
                binding.editQuantidadePizza.setText("1")
                binding.textPrecoPizza.visibility = View.VISIBLE
            } else {
                binding.editQuantidadePizza.setText("0")
                binding.textPrecoPizza.visibility = View.GONE
            }
        }

        // Configura um listener de clique para a caixa de seleção de salada, que ajusta a visibilidade do campo de quantidade e preço.
        binding.checkSalada.setOnClickListener {
            if (binding.checkSalada.isChecked()) {
                binding.editQuantidadeSalada.setText("1")
                binding.textPrecoSalada.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSalada.setText("0")
                binding.textPrecoSalada.visibility = View.GONE
            }
        }

        // Configura um listener de clique para a caixa de seleção de hambúrguer, que ajusta a visibilidade do campo de quantidade e preço.
        binding.checkHamburger.setOnClickListener {
            if (binding.checkHamburger.isChecked()) {
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }
    }

}
        }

    }
}