package datos;

public class SemiCirculo extends Circulo {

    public SemiCirculo(double radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        double a;
        a = (PI * this.getRadio() * this.getRadio()) / 2;
        return a;
    }

    @Override
    public double calcularPerimetro() {
        double p;
        p = PI * this.getRadio() + 2 * this.getRadio();
        return p;
    }

}
