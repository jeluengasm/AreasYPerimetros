
package datos;

public class Equilatero extends Triangulo{
    
    public Equilatero(double lado1){
        super(lado1);
    }
    
    public static boolean esEquilatero(double lado1, double lado2, double lado3){
        if((lado1 == lado2)&&(lado1 == lado3)){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Equilatero\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }
    
}
