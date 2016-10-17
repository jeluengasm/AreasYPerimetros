package datos;

import UI.Operador;

public abstract class Cuadrilatero extends Forma implements Operador {

    private double ladoA;
    private double ladoB;

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

}
