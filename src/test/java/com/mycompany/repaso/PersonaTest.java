/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.repaso;

import java.time.LocalDate;
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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of Constructor method, of class Persona.
     * creamos un nuevo objeto persona con diferentes valores definidos 
     * y ayudandonos de variables comparamos los datos originales con
     * respecto a los valores dados originalmente
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        int nif,dia,mes,ano;
        char genero;
        Nif auxNif;
        LocalDate nacimiento;
        String nombre;
        nif=12345678;
        auxNif = new Nif(nif);
        dia=18;
        mes=11;
        ano= 1997;
        genero = 'M';
        nombre = "Jesus";
        nacimiento = LocalDate.of(ano, mes, dia);
        Persona instance = new Persona(nif, nombre ,genero, dia, mes, ano);
        assertEquals(auxNif, instance.getNif());
        assertEquals(nombre, instance.getNombre());
        assertEquals(genero, instance.getGenero());
        assertEquals(nacimiento, instance.getNacimiento());
    }

    
}
