/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;
    /**
     * Constructor basico establece por defecto valores minimos
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }
    /**
     * Constructor que establece el nif, valores minimos para el resto de valores
     * @param nif numero del nif de la pernosa
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }
    /**
     * Constructor completo toma valores para inicializar todos los atributos de la clase,
     * dia, mes y ano se utilizaran para establecer nacimiento
     * @param nif numero del nif de la pernosa
     * @param nombre nombre de la persona
     * @param genero genero de la persona 'M' Masculino 'F' Femenino '' Sin definir
     * @param dia dia de nacimiento
     * @param mes mes de nacimiento
     * @param ano año de nacimiento
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }
    /**
     * 
     * @return el nif de la persona
     */
    public Nif getNif() {
        return nif;
    }
    /**
     * establece el nif de la persona
     * @param nif objeto Nif que estableceremos como nif
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }
    /**
     * 
     * @return retorna el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * establecemos el nombre de la persona
     * @param nombre String que estableceremos como nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return retorna un char que define su genero <br>
     * 'M' Masculino <br>
     * 'F' Femenino <br>
     * ''  indefinido <br>
     */
    public char getGenero() {
        return genero;
    }
    /**
     * establecemos el genero de la persona mediate un char<br>
     * 'M' Masculino <br>
     * 'F' Femenino <br>
     * ''  indefinido <br>
     * @param genero Char que define el genero de la persona
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return retorna un LocalDate con la fecha de nacimiento de la persona
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    /**
     * establece la fecha de nacimiento de la persona
     * @param nacimiento LocalDate que queremos establecer como fecha de nacimiento
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    /**
     * Calcula la edad de la persona basandose con la fecha actual
     * @return un int con la edad de la persona (podria ser un byte)
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }
    /**
     * Toma la informacion de la persona y le da un formato de columnas
     * @return retorna un String con los datos de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }
    /**
     * compara la igualdad de la persona en base a su nif
     * @param a persona con la que queremos comparar.
     * @return retorna true en caso de tener el mismo nif<br>
     * retotna false si son diferentes o si la persona a comparar es nula
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }
    /**
     * compara persona con un objeto basandose en la direecion de memoria
     * o clase o con el comparador previo.
     * @param obj un objeto a comparar
     * @return retonra tru si tienen la misma direccion de memoria o si tienen el
     * mismo nif
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }
    /**
     * define el orden natural de personas en base al nif
     * @param o perosna a comparar
     * @return retorna un entero que define la cosicion de uno respecto al otro
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
