/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
Los valores deben ser aleatorios.

• mojar(): devuelve true si la posición del agua coincide con la posición actual

• siguienteChorro(): cambia a la siguiente posición del tambor

• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuego {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    RevolverDeAgua r = new RevolverDeAgua();
    Jugador j = new Jugador();
    Juego juego = new Juego();

    ArrayList<Jugador> lista_jugadores = new ArrayList();

    public void llenarLista_Jugadores() {

        System.out.println("Ingrese la cantidad de Jugadores [1-6 Jugadores]");
        Integer cant = Integer.parseInt(leer.next());

        if (cant < 1 || cant > 6) {
            cant = 6;
        }

        for (int i = 0; i < cant; i++) {
            Jugador j1 = new Jugador();

            System.out.println("Ingrese el Nombre");
            String nombre = leer.next();

            j1.setNombre(nombre);
            j1.setId(i + 1);
            j1.setMojado(false);

            lista_jugadores.add(j1);
        }

    }

    public void llenarRevolver() {

        Integer posiActual = (int) (Math.random() * 6 + 1);
        Integer posiAgua = (int) (Math.random() * 6 + 1);

        r.setPosiActual(posiActual);
        r.setPosiAgua(posiAgua);

    }

    public boolean mojar() {
        return (r.getPosiActual() == r.getPosiAgua());
    }

    public void siguienteChorro() {
        r.setPosiActual(r.getPosiActual() + 1);

        if (r.getPosiActual() == 7) {
            r.setPosiActual(1);
        }
    }

    public boolean disparo(RevolverDeAgua r) {
        if (mojar()) {
            j.setMojado(true);
        } else {
            siguienteChorro();
        }
        return j.isMojado();
    }

    public void llenarJuego() {

        juego.setRevolver(r);
        juego.setlista_jugadores(lista_jugadores);

    }

    public void ronda() {

        String nombreJugadorMojado = "";

        boolean bandera = true;

        System.out.println(r.getPosiActual() + " Posicion Actual");
        System.out.println(r.getPosiAgua() + " Posicion De Agua");

        do {
            for (Jugador jugador : lista_jugadores) {

                System.out.println("\nTurno del jugador " + jugador.getId());

                if (disparo(r)) {

                    nombreJugadorMojado = jugador.getNombre();

                    System.out.println("SE DISPARO EL ARMA!!");

                    bandera = false;

                    break;

                } else {
                    System.out.println("\nEl " + jugador.getNombre() + " Se Salvo");
                    System.out.println("\nSiguiente...");
                }

            }
        } while (bandera);

        System.out.println("\nEl Perdedor fue el Jugador " + nombreJugadorMojado);

    }

}
