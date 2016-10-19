
package datos;

public class Isoceles extends Triangulo{
    public Isoceles(double lado1, double lado2){
        super(lado1, lado2);
    }
    
    public boolean esIsoceles(){
        return ((this.getLado1() == this.getLado2())&&(this.getLado1() != this.getLado3()))
                ||((this.getLado1() == this.getLado3())&&(this.getLado1() != this.getLado2()))
                ||((this.getLado2() == this.getLado3())&&(this.getLado2() != this.getLado1()));
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Isosceles\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }    
}
