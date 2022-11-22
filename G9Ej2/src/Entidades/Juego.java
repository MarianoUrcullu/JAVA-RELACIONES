/*
esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package Entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> lista_jugadores = new ArrayList();
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getlista_jugadores() {
        return lista_jugadores;
    }

    public void setlista_jugadores(ArrayList<Jugador> lista_jugadores) {
        this.lista_jugadores = lista_jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

}
