package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaSimpleTest {

    //Hay que crear un objeto para el testeo
    PruebaSimple miPrueba = new PruebaSimple();
    @Test
    void prueba1() {
        assertEquals(false, miPrueba.prueba1(1,2));
    }
}