
package datos;

public class Escaleno extends Triangulo{
    public Escaleno(double lado1, double lado2, double lado3){
        super(lado1, lado2, lado3);
    }
    
    public boolean esEscaleno(){
        return (this.getLado1() != this.getLado2())&&(this.getLado1() != this.getLado3())&&(this.getLado2() != this.getLado3());
    }

    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Escaleno\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }    
}
