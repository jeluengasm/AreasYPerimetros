package datos;


public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double ladoA, double ladoB){
        super(ladoA, ladoB);
    }

    public Rectangulo(double ladoA){
        super(ladoA);
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nFigura: Rectangulo\nArea: " + this.calcularArea()+ "\nPerimetro: " + this.calcularPerimetro());
    }
}