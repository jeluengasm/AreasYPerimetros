/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author LENOVO
 */
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
    public double calcularArea() {
        double s = (this.calcularPerimetro()/2);
        return Math.sqrt((s*(s-this.getLado1())*(s-this.getLado2())*(s-this.getLado3())));
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado1()+this.getLado2()+this.getLado3();
    }
    
}
