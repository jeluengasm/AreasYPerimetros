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
public class Trapecio extends Cuadrilatero{
    
    double lado;
    double baseMayor = this.getLadoA();
    double baseMenor = this.getLadoB();
    
    public Trapecio (){
        super();
    }

    @Override
    public double calcularArea() {
       double a =  (((this.getLadoA() +this.getLadoB() ) * this.obtenerAltura() )/2);
       return a;
    }
    
    @Override
    public double calcularPerimetro( Tra) {
        double p = this.baseMayor + this.baseMenor + this.getLado()*2;
        return p;
    }
    
    public double  obtenerAltura (){
        
        double a = Math.sqrt( Math.pow(this.getLado(), 2)+ Math.pow(((this.baseMayor-this.baseMenor)/2),2));
        return a;
    }

    public double getLado() {
        return lado;
    }
    
    
    
}
