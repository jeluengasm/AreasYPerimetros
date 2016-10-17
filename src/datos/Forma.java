package datos;

import UI.Operador;


public abstract class Forma implements Operador{
    
    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    
}
