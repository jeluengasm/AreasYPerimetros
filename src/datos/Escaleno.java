
package datos;

public class Escaleno extends Triangulo{
    public Escaleno(double lado1, double lado2, double lado3){
        super(lado1, lado2, lado3);
    }
    
    public static boolean esEscaleno(double lado1, double lado2, double lado3){
        if((lado1 != lado2)&&(lado1 != lado3)&&(lado2 != lado3)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString().concat("\nTipo: Escaleno\nArea: " + this.calcularArea() + "\nPerimetro: " + this.calcularPerimetro());
    }    
}
