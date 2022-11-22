package g9ej2;

import Servicios.ServicioJuego;

public class G9Ej2 {

    public static void main(String[] args) {

        ServicioJuego servicio = new ServicioJuego();

        servicio.llenarRevolver();

        servicio.llenarLista_Jugadores();

        servicio.llenarJuego();

        servicio.ronda();

    }

}
