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
public abstract  class Rectangulo extends Cuadrilatero{
    
    
    
    public Rectangulo(){
        super();
    }

    public double calcularArea(Cuadrilatero c) {
        double a = c.getLadoA() *c.getLadoB();
        return a;
    
    }

    public double calcularPerimetro(Cuadrilatero c) {
        double a = c.getLadoB()*2 + c.getLadoA()*2;
        return a;
    }

    
    
}
