package com.hamburgueria;

import com.hamburgueria.ingredientes.Carne;
import com.hamburgueria.ingredientes.Pao;
import com.hamburgueria.ingredientes.Queijo;
import com.hamburgueria.pedidos.Cozinha;
import com.hamburgueria.pedidos.Pedido;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CozinhaTest {
    private static  final Logger LOGGER = LoggerFactory.getLogger(HamburgueriaTests.class);
    @Test
    public void testPrepararPedido() {


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Cozinha cozinha = new Cozinha();

        Pao pao = new Pao();
        Carne carne = new Carne();
        Queijo queijo = new Queijo();
        Pedido pedido = new Pedido(pao, carne, queijo);



        cozinha.prepararPedido(pedido);
        LOGGER.info("Chama o método que imprime no console");


        String resultado = outputStream.toString();
        LOGGER.info("Captura a saída do console");


        assertEquals("Preparando um hambúrguer com Brioche, Angus e queijo Cheddar!", resultado.trim());
        LOGGER.info("Verifica se a string de resultado contém os ingredientes esperados");



        LOGGER.debug("Teste de preparo de pedido executado com sucesso!");

        System.setOut(System.out);
        LOGGER.info("Restaura a saída padrão");
    }
}
