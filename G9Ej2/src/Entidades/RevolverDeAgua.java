/*
Esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua 
(la posición del tambor donde se encuentra el agua). Estas dos posiciones,
se generarán aleatoriamente.

• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

public class RevolverDeAgua {

    private Integer posiActual, posiAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posiActual, Integer posiAgua) {
        this.posiActual = posiActual;
        this.posiAgua = posiAgua;
    }

    public Integer getPosiActual() {
        return posiActual;
    }

    public void setPosiActual(Integer posiActual) {
        this.posiActual = posiActual;
    }

    public Integer getPosiAgua() {
        return posiAgua;
    }

    public void setPosiAgua(Integer posiAgua) {
        this.posiAgua = posiAgua;
    }

    @Override
    public String toString() {
        return "Posision Actual: " + posiActual + " Posicion Agua: " + posiAgua;
    }

}
