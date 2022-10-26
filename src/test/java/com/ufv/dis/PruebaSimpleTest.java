package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaSimpleTest {

    //Hay que crear un objeto para el testeo
    PruebaSimple miPrueba = new PruebaSimple();
    @Test
    void prueba1() {
        assertEquals(false, miPrueba.prueba1(1,2));
        //Si a es mayor que B me tiene que devolver TRUE que es la primera opción
        assertEquals(true, miPrueba.prueba1(1000,2));
        assertEquals(true, miPrueba.prueba1('2',1));
        
    }
}