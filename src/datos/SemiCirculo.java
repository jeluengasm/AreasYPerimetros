package datos;

public class SemiCirculo extends Circulo {

    public SemiCirculo(double radio) {
        super(radio);
    }

    @Override
    public double calcularArea(Circulo c) {
        double a;
        
        a = c.getRadio()* Circulo.PI;
        
        return a;
    }

    @Override
    public double calcularPerimetro(Circulo c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
