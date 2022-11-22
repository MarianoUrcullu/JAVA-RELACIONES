/*
nombre, raza, edad y tamaño.
 */
package Servicios;

import Entidades.Perro;
import java.util.Scanner;

public class ServicioPerro {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro() {
        System.out.println("-----[DATOS DEL PERRO]-----");
        
        System.out.print("\nIngrese Nombre: ");
        String nombre = leer.next();
        
        System.out.print("\nIngrese Raza: ");
        String raza = leer.next();
        
        System.out.print("\nIngrese Edad: ");
        Integer edad = Integer.parseInt(leer.next());
        
        System.out.print("\nIngrese Tamaño: ");
        String tamanio = leer.next();
        
        return new Perro(nombre, raza, tamanio, edad);
    }
}
