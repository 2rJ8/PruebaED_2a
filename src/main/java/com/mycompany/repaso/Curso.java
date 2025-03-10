/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;
    
    /**
     * optenemos el nombre del cuso
     * @return retorna un string con el nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }
    /**
     * constructor que toma el nombre del curso
     * @param nombre nombre por el que se identificara el curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    
    /**
     * Muestra el contenido de listaAlumnos en formato tabla
     * @return Retorna un String con los datos de todos los alumnos de listaAlumnos
     * con un formato preestablecido
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    /**
     * Añade el alumno pasado por parametro al set de listaAlumnos
     * @param p Alumno a añadir, en caso de ya estar presente en la lista no se añadira
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
