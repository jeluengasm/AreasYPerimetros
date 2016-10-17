package datos;


public abstract class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(double ladoA){
        super(ladoA);
    }

    public double calcularArea() {
        double a = this.getLadoA() * this.getLadoA();
        return a;
    
    }
    
    public double calcularPerimetro() {
        double p = this.getLadoA() * 4;
        return p;
    }
}