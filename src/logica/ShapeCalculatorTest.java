package logica;

import UI.OperadorCirculo;
import datos.*;

public class ShapeCalculatorTest {
    
    public static void main(String[] args) {
        
      Cuadrilatero c = new Cuadrado(3);
      Cuadrilatero r = new Rectangulo(3,3);
      Cuadrilatero t = new Trapecio(1,2,3,4,5);
      Triangulo eq = new Equilatero(2);
      Triangulo i = new Isoceles(2,3);
      Triangulo es = new Escaleno(2,4,5);
      
      System.out.println(c + "\n");
      System.out.println(r + "\n");
      System.out.println(t + "\n");
      System.out.println(eq + "\n");
      System.out.println(i + "\n");
      System.out.println(es);
    }
}
