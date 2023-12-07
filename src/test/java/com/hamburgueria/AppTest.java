package com.hamburgueria;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void testSoma() {
        int resultado = App.soma(2, 3);


        assertEquals(5, resultado);

        if (resultado != 5) {
            LOGGER.error("Erro na função soma: Resultado esperado não foi alcançado");
        }
    }
}

