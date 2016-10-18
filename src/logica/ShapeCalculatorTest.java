package logica;

import UI.ShapeCalculatorUI;
import datos.*;

public class ShapeCalculatorTest {

    public static void main(String[] args) {
        OUTER:
        do {
            switch (ShapeCalculatorUI.menuPrincipal()) {
                case 1:
                    Forma rectangulo = new Rectangulo(ShapeCalculatorUI.peticionLadoA(), ShapeCalculatorUI.peticionLadoB());
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(rectangulo);
                    break;
                case 2:
                    Forma cuadrado = new Cuadrado(ShapeCalculatorUI.peticionLadoA());
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(cuadrado);
                    break;
                case 3:
                    Forma trapecio = new Trapecio(0, 0, ShapeCalculatorUI.peticionAltura(), ShapeCalculatorUI.peticionBaseMayor(), ShapeCalculatorUI.peticionBaseMenor());
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(trapecio);
                    break;
                case 4:
                    Triangulo equilatero = new Equilatero(ShapeCalculatorUI.peticionLado1());
                    while (ShapeCalculatorUI.comprobarTriangulo((Equilatero) equilatero) || ShapeCalculatorUI.comprobarEquilatero((Equilatero) equilatero)) {
                        equilatero.setLado1(ShapeCalculatorUI.peticionLado1());
                    }
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(equilatero);
                    break;
                case 5:
                    Triangulo isoceles = new Isoceles(ShapeCalculatorUI.peticionLadoRepitente(), ShapeCalculatorUI.peticionLado2());
                    while (ShapeCalculatorUI.comprobarTriangulo((Isoceles) isoceles) || ShapeCalculatorUI.comprobarIsoceles((Isoceles) isoceles)) {
                        isoceles.setLado1(ShapeCalculatorUI.peticionLadoRepitente());
                        isoceles.setLado2(ShapeCalculatorUI.peticionLado2());
                        isoceles.setLado3(isoceles.getLado1());
                    }
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(isoceles);
                    break;
                case 6:
                    Triangulo escaleno = new Escaleno(ShapeCalculatorUI.peticionLado1(), ShapeCalculatorUI.peticionLado2(), ShapeCalculatorUI.peticionLado3());
                    while (ShapeCalculatorUI.comprobarTriangulo((Escaleno) escaleno) || ShapeCalculatorUI.comprobarEscaleno((Escaleno) escaleno)) {
                        escaleno.setLado1(ShapeCalculatorUI.peticionLado1());
                        escaleno.setLado2(ShapeCalculatorUI.peticionLado2());
                        escaleno.setLado3(ShapeCalculatorUI.peticionLado3());
                    }
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(escaleno);
                    break;
                case 7:
                    Forma circulo = new Circulo(ShapeCalculatorUI.peticionRadio());
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(circulo);
                    break;
                case 8:
                    Forma semicirculo = new SemiCirculo(ShapeCalculatorUI.peticionRadio());
                    ShapeCalculatorUI.printShapeAreaAndPerimeter(semicirculo);
                    break;
                case 0:
                    break OUTER;
            }
        } while (true);
    }
}
