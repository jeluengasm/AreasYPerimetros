package datos;

public class Trapecio extends Cuadrilatero{
    double altura;
    double baseMayor;
    double baseMenor;
    
    public Trapecio (double ladoA, double ladoB, double altura, double baseMayor, double baseMenor){
        super(ladoA, ladoB);
        this.altura = altura;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
    }

    public double calcularArea() {
       double a =  ((((this.getBaseMayor()) + this.getBaseMenor()) * this.getAltura())/2);
       return a;
    }
    
    public double calcularPerimetro() {
        double p = this.baseMayor + this.baseMenor + this.getLadoA() + this.getLadoB();
        return p;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }
}