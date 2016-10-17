package datos;

public class Cuadrado extends Cuadrilatero{ //Tiene que ser así para que concatene con el toString de Cuadrilatero y no Rectangulo
    
    public Cuadrado(double ladoA){
        super(ladoA);
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nFigura: Cuadrado\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }

}