/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package g9ej3.Servicios;

import g9ej3.Entidades.Carta;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ServicioJuego {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Creamos la Baraja utilizando un metodo que devuelte una LinkedList de
     * carta. Para ello utilizamos un vector con los "Palos" y recorremos un for
     * mejorado que contenga otro for que valla de 1 a 12 (salteando 8 y 9) y
     * agregamos una nueva Carta al mazo con su respectivo numero y palo.
     *
     * @return baraja;
     */
    public LinkedList<Carta> crearBaraja() {
        LinkedList<Carta> baraja = new LinkedList();
        String[] palos = {"Oros", "Copas", "Bastos", "Espadas"};
        for (String palo : palos) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }
                baraja.add(new Carta(j, palo));
            }
        }
        return baraja;
    }

    /**
     * Mezlacmos la baraja
     *
     * @param baraja
     */
    public void barajar(LinkedList<Carta> baraja) {
        Collections.shuffle(baraja);
    }

    /**
     * Muestra las cartas disponibles en el mazo
     *
     * @param baraja
     * @return Integer cantidad
     */
    public Integer cartasDisponibles(LinkedList<Carta> baraja) {
        return baraja.size();
    }

    /**
     * Agregamos la primera carta de la Baraja en el Monton
     *
     * @param baraja
     * @param monton
     */
    public void siguienteCarta(LinkedList<Carta> baraja, LinkedList<Carta> monton) {

        if (baraja.isEmpty()) {
            System.out.println("No hay Cartas en el Mazo");
        } else {
            monton.add(baraja.getFirst());
            System.out.println(baraja.getFirst());
            baraja.removeFirst();
            System.out.println("Se Paso la Carta " + monton.getLast() + " al monton");

        }

    }

    /**
     * Agregamos una cierta cantidad de cartas al monton
     *
     * @param baraja
     * @param monton
     */
    public void darCartas(LinkedList<Carta> baraja, LinkedList<Carta> monton) {

        System.out.println("Cuantas Cartas queres ?");
        Integer cant = Integer.parseInt(leer.next());

        if (cant > cartasDisponibles(baraja)) {
            System.out.println("No hay cartas suficientes");
        } else {
            for (int i = 0; i < cant; i++) {
                siguienteCarta(baraja, monton);
            }
        }

    }

    /**
     * Mostramos las Cartas que se encuentran en el mazo
     *
     * @param mazo
     * @param tipoMazo
     */
    public void mostrarMazo(LinkedList<Carta> mazo, String tipoMazo) {

        if (mazo.isEmpty()) {
            System.out.println("No hay Cartas en " + tipoMazo);
        } else {
            System.out.println("Las Cartas son:");
            mazo.forEach((aux) -> {
                System.out.println(aux);
            });
        }
    }

    public void jugar() {
        LinkedList<Carta> baraja = crearBaraja();
        LinkedList<Carta> monton = new LinkedList();
        int opcion;
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Barajar");
            System.out.println("2 - Cartas disponibles");
            System.out.println("3 - Siguiente carta");
            System.out.println("4 - Dar cartas");
            System.out.println("5 - Mostrar baraja");
            System.out.println("6 - Mostrar montón");
            System.out.println("7 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    barajar(baraja);
                    break;
                case 2:
                    System.out.println("Las cantidad de cartas disponibles son: " + cartasDisponibles(baraja));
                    break;
                case 3:
                    siguienteCarta(baraja, monton);
                    break;
                case 4:
                    darCartas(baraja, monton);
                    break;
                case 5:
                    mostrarMazo(baraja, "Baraja");
                    break;
                case 6:
                    mostrarMazo(monton, "Montón");
                    break;
                case 7:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (opcion != 7);
    }

}
