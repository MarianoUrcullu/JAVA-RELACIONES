/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package g9ej1;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class G9Ej1 {

    public static void main(String[] args) {
        
        ServicioPersona servicio = new ServicioPersona();
        
        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();
        
        servicio.mostrarPersona(p1);
        
        servicio.mostrarPersona(p2);
        
    }

}
