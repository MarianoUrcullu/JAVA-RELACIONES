/*
esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 
 */
package Entidades;

public class Jugador {

    private Integer Id;
    private String Nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer Id, String Nombre, boolean mojado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

}
