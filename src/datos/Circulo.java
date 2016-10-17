package datos;

import UI.Operador;

public class Circulo extends Forma implements Operador {

    private double radio;
    public final static double PI = 3.14159265;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        double a;
        a = PI * this.getRadio() * this.getRadio();
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double p;
        p = 2 * PI * this.getRadio();
        return p;
    }

}
