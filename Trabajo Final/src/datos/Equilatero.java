package datos;

public class Equilatero extends Triangulo{
    
    public Equilatero(double lado1){
        super(lado1);
    }
    
    public boolean esEquilatero(){
        return (this.getLado1() == this.getLado2())&&(this.getLado1() == this.getLado3());
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Equilatero\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }
    
}
