package com.hamburgueria;

import com.hamburgueria.clientes.Cliente;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {
    private static  final Logger LOGGER = LoggerFactory.getLogger(HamburgueriaTests.class);
    @Test
    public void testFazerPedidoSemCozinha() {
        Cliente cliente = new Cliente("João", null);

        assertThrows(NullPointerException.class, cliente::fazerPedido);
        LOGGER.info("Verifica se uma exceção é lançada ao fazer um pedido sem uma cozinha");





    }

}
