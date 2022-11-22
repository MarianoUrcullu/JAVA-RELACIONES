/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    private Scanner leer;
    private ServicioPerro servicio_perro;

    public ServicioPersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.servicio_perro = new ServicioPerro();
    }

    public Persona crearPersona() {
        ArrayList<Perro> lista_perros = new ArrayList();

        System.out.println("-----[DATOS DE LA PERSONA]-----");

        System.out.print("\nIngrese Nombre: ");
        String nombre = leer.next();

        System.out.print("\nIngrese Apellido: ");
        String apellido = leer.next();

        System.out.print("\nIngrese Edad: ");
        Integer edad = Integer.parseInt(leer.next());

        System.out.print("\nIngrese Documento: ");
        Integer documento = Integer.parseInt(leer.next());

        System.out.print("\nTiene Perros? ");
        String res = leer.next();
        if (res.equalsIgnoreCase("si")) {
            System.out.println("Cuantos tiene?");
            Integer cantidad = Integer.parseInt(leer.next());
            añadirPerros(cantidad, lista_perros);

        }

        return new Persona(nombre, apellido, edad, documento, lista_perros);
    }

    public void añadirPerros(Integer cantidad, ArrayList<Perro> lista_perros) {
        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                Perro p = servicio_perro.crearPerro();
                lista_perros.add(p);
            }
        }
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p.toString());
    }

}
