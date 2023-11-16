package com.hamburgueria.clientes;

import com.hamburgueria.ingredientes.Pao;
import com.hamburgueria.ingredientes.Carne;
import com.hamburgueria.ingredientes.Queijo;
import com.hamburgueria.pedidos.Pedido;
import com.hamburgueria.pedidos.Cozinha;
import lombok.Data;

@Data
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void fazerPedido(Cozinha cozinha) {
        System.out.println(nome + " está fazendo um pedido!");


        Pao pao = new Pao();
        Carne carne = new Carne();
        Queijo queijo = new Queijo();


        Pedido pedido = new Pedido(pao, carne, queijo);
        cozinha.prepararPedido(pedido);
    }
}
