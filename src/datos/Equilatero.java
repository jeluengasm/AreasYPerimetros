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
}
