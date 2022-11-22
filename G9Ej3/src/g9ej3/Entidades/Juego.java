/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9ej3.Entidades;

import java.util.LinkedList;

public class Juego {

    private LinkedList<Carta> baraja;
    private LinkedList<Carta> monton;

    public Juego() {
    }

    public Juego(LinkedList<Carta> baraja, LinkedList<Carta> monton) {
        this.baraja = baraja;
        this.monton = monton;
    }

    public LinkedList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(LinkedList<Carta> baraja) {
        this.baraja = baraja;
    }

    public LinkedList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(LinkedList<Carta> monton) {
        this.monton = monton;
    }

}
