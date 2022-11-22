/*
Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
package Entidades;

import java.util.ArrayList;

public class Persona {

    private String nombre, apellido;
    private Integer edad, documento;
    private ArrayList<Perro> lista_perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, ArrayList<Perro> lista_perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.lista_perros = lista_perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getLista_perros() {
        return lista_perros;
    }

    public void setLista_perros(ArrayList<Perro> lista_perros) {
        this.lista_perros = lista_perros;
    }

    @Override
    public String toString() {
        return "Persona --> [ Nombre: " + nombre + " Apellido: " + apellido
                + " Edad: " + edad + " Documento:" + documento
                + " Perros: " + lista_perros + ']';
    }

}
