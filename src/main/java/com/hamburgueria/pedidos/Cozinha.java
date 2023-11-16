package com.hamburgueria.pedidos;

import lombok.Data;

@Data
public class Cozinha {
    public void prepararPedido(Pedido pedido) {
        System.out.println("Preparando um hambúrguer com " +
                pedido.getPao().getTipo() + ", " +
                pedido.getCarne().getTipo() + " e queijo " +
                pedido.getQueijo().getTipo() + "!");
    }
}
