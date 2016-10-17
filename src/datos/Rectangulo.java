package datos;


public abstract  class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double ladoA, double ladoB){
        super(ladoA, ladoB);
    }

    public double calcularArea() {
        double a = this.getLadoA() * this.getLadoB();
        return a;
    
    }

    public double calcularPerimetro() {
        double a = this.getLadoB()*2 + this.getLadoA()*2;
        return a;
    }   
}