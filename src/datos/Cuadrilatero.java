package datos;

import UI.Operador;

public abstract class Cuadrilatero extends Forma implements Operador {

    private double ladoA;
    private double ladoB;

    public Cuadrilatero(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Cuadrilatero(double ladoA) {
        this.ladoA = ladoA;
        this.ladoB = ladoA;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    @Override
    public double calcularArea() {
        double a = this.getLadoA() * this.getLadoB();
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double a = this.getLadoB() * 2 + this.getLadoA() * 2;
        return a;
    }
    
}
