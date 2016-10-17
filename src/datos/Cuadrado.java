/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author brian
 */
public abstract class Cuadrado extends Cuadrilatero{
    
   
    
    public Cuadrado(){
        super();
    }

    
    
    public double calcularArea() {
        double a = this.getLadoA() *this.getLadoB();
        return a;
    
    }

    
    public double calcularPerimetro() {
        double a = this.getLadoB()*2 + this.getLadoA()*2;
        return a;
    }

    
    

}