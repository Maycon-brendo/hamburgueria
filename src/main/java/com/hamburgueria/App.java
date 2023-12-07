package com.hamburgueria;

import com.hamburgueria.ingredientes.Pao;
import com.hamburgueria.ingredientes.Carne;
import com.hamburgueria.ingredientes.Queijo;
import com.hamburgueria.pedidos.Pedido;
import com.hamburgueria.pedidos.Cozinha;
import com.hamburgueria.clientes.Cliente;

public class App {
    public static void main(String[] args) {
        Pao pao = new Pao();
        Carne carne = new Carne();
        Queijo queijo = new Queijo();

        Pedido pedido = new Pedido(pao, carne, queijo);

        Cozinha cozinha = new Cozinha();
        cozinha.prepararPedido(pedido);

        // Agora, crie um cliente com a referência para a cozinha
        Cliente cliente = new Cliente("João", cozinha);

        // Faça o pedido usando a instância do cliente
        cliente.fazerPedido();
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
