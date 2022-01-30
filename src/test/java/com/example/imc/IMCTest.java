package com.example.imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    @Test
    void deveSerHomemAbaixoDoPeso(){
       IMC imc = new IMC(20.6,1, true);
       assertEquals("Abaixo do peso", imc.calcularIMC());
    }

    @Test
    void deveSerHomemNoPesoNormal(){
        IMC imc = new IMC(26.3, 1, true);
        imc.setPeso(26.3);
        imc.setAltura(1.0);
        imc.setSexo(true);
        assertEquals("No peso normal", imc.calcularIMC());
    }

    @Test
    void deveSerHomemAcimaDoPeso(){
        IMC imc = new IMC(31.0, 1, true);
        assertEquals("Acima do peso", imc.calcularIMC());
    }

    @Test
    void deveSerHomemObeso(){
        IMC imc = new IMC(31.1, 1, true);
        assertEquals("Obeso", imc.calcularIMC());
    }

    @Test
    void deveSerMulherAbaixoDoPeso(){
        IMC imc = new IMC(19.0, 1, false);
        assertEquals("Abaixo do peso", imc.calcularIMC());

    }

    @Test
    void deveSerMulherNoPesoNormal(){
        IMC imc = new IMC(25.7, 1, false);
        assertEquals("No peso normal", imc.calcularIMC());

    }

    @Test
    void deveSerMulherAcimaDoPeso(){
        IMC imc = new IMC(32.2, 1, false);
        assertEquals("Acima do peso", imc.calcularIMC());

    }

    @Test
    void deveSerMulherObeso(){
        IMC imc = new IMC(32.3, 1, false);
        assertEquals("Obeso", imc.calcularIMC());

    }
}