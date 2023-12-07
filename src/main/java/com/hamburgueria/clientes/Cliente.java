package com.hamburgueria.clientes;

import com.hamburgueria.ingredientes.Carne;
import com.hamburgueria.ingredientes.Pao;
import com.hamburgueria.ingredientes.Queijo;
import com.hamburgueria.pedidos.Cozinha;
import com.hamburgueria.pedidos.Pedido;
import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private Cozinha cozinha;

    public Cliente(String nome, Cozinha cozinha) {
        this.nome = nome;
        this.cozinha = cozinha;
    }

    public void fazerPedido() {
        System.out.println(nome + " está fazendo um pedido!");

        Pao pao = new Pao();
        Carne carne = new Carne();
        Queijo queijo = new Queijo();

        Pedido pedido = new Pedido(pao, carne, queijo);


        cozinha.prepararPedido(pedido);
    }
}
