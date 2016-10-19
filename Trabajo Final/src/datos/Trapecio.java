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

    @Override
    public double calcularArea() {
       double a =  ((((this.getBaseMayor()) + this.getBaseMenor()) * this.getAltura())/2);
       return a;
    }
    
    @Override
    public double calcularPerimetro() {
        double p = this.getBaseMayor() + this.getBaseMenor() + this.getLadoA() + this.getLadoB();
        return p;
    }

    public double getAltura() {
        return altura;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nBase mayor: " + this.getBaseMayor() + "\nBase menor: " + this.getBaseMenor() + "\nAltura: " + this.getAltura()+ "\nFigura: Trapecio\nArea: " + this.calcularArea()+ "\nPerimetro: " + this.calcularPerimetro());
    }
}