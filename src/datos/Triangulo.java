package datos;

import UI.Operador;

public abstract class Triangulo extends Forma implements Operador {
    
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    
}
