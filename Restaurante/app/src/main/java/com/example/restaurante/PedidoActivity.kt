package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // Infla o layout da ActivityPedido usando a classe de binding gerada automaticamente.
        binding = ActivityPedidoBinding.inflate(layoutInflater)

// Chama a implementação da superclasse do método onCreate para configurar o estado da atividade.
        super.onCreate(savedInstanceState)

// Define o layout da atividade como a raiz do layout inflado.
        setContentView(binding.root)

// Obtém o Intent que iniciou esta atividade.
        val i = intent

// Extrai e converte os valores de quantidade de pizza, salada e hambúrguer dos extras do Intent.
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

// Cria uma string de resumo do pedido com base nas quantidades e preços calculados.
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza * 8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada * 10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer * 12}\n"

// Define o texto do TextView no layout com o resumo do pedido.
        binding.textResumo.text = texto

    }
}