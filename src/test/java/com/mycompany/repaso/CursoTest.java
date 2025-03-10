/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.repaso;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vespertino
 */
public class CursoTest {
    
    public CursoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of aniadirAlumno method, of class Curso.
     * para comprobar esto hacemos uso de la funcion to string de la clase persona
     * y de la clase curso tomando la ultima linea de este y comparamos ambos esperando
     * una igualdad entre los dos
     */
    @Test
    public void testAniadirAlumno() {
        String result;
        String[] aux2;
        System.out.println("aniadirAlumno");
        Persona p = new Persona(12345678, "pepe", 'M', 18, 11, 1997);
        Curso instance = new Curso("name");
        instance.aniadirAlumno(p);
        aux2 = instance.toString().split("\n");
        result = aux2[aux2.length -1];
        assertEquals(p.toString(), result);
        
    }
    
}
