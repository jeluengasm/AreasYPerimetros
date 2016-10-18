package datos;

public class Cuadrado extends Cuadrilatero{
    
    public Cuadrado(double ladoA){
        super(ladoA);
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nFigura: Cuadrado\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }

}