package datos;

import UI.OperadorCirculo;


public abstract class Forma implements OperadorCirculo {
    
    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    
}
