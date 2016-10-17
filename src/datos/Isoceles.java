
package datos;

public class Isoceles extends Triangulo{
    public Isoceles(double lado1, double lado2){
        super(lado1, lado2);
    }
    
    public static boolean esIsoceles(double lado1, double lado2, double lado3){
        if(((lado1 == lado2)&&(lado1 != lado3))||((lado1 == lado3)&&(lado1 != lado2))||((lado2 == lado3)&&(lado2 != lado1))){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Isosceles\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }    
}
