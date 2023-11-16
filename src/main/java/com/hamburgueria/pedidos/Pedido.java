package com.hamburgueria.pedidos;

import com.hamburgueria.ingredientes.Pao;
import com.hamburgueria.ingredientes.Carne;
import com.hamburgueria.ingredientes.Queijo;
import lombok.Data;

@Data
public class Pedido {
    private Pao pao;
    private Carne carne;
    private Queijo queijo;

    public Pedido(Pao pao, Carne carne, Queijo queijo) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
    }
}
