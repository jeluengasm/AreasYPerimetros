package UI;

import datos.Equilatero;
import datos.Escaleno;
import datos.Forma;
import datos.Isoceles;
import datos.Triangulo;
import java.util.Scanner;

public class ShapeCalculatorUI {

    static Scanner leer = new Scanner(System.in);

    public static int menuPrincipal() {
        int menu;
        System.out.println("Para seleccionar una opcion escriba el numero correspondiente y presione Enter");
        System.out.println("De que figura desea hallar el area y perimetro?");
        System.out.println("Cuadrilateros:");
        System.out.println("<1> Rectangulo");
        System.out.println("<2> Cuadrado");
        System.out.println("<3> Trapecio");
        System.out.println("Triangulos:");
        System.out.println("<4> Equilatero");
        System.out.println("<5> Isoceles");
        System.out.println("<6> Escaleno");
        System.out.println("Otros:");
        System.out.println("<7> Circulo");
        System.out.println("<8> Semicirculo");
        System.out.println("<0> Salir");

        menu = leer.nextInt();
        while (menu < 0 || menu > 8) {
            System.out.println("ingrese un numero valido");
            menu = leer.nextInt();
        }

        return menu;
    }

    public static double peticionRadio() {
        double radio;
        System.out.println("Ingrese valor del radio");
        radio = leer.nextDouble();
        while (radio <= 0) {
            System.out.println("Ingrese un numero valido");
            radio = leer.nextDouble();
        }
        return radio;
    }

    public static double peticionLadoA() {
        double ladoA;
        System.out.println("Ingrese el valor del LadoA");
        ladoA = leer.nextDouble();
        while (ladoA <= 0) {
            System.out.println("Ingrese un numero valido");
            ladoA = leer.nextDouble();
        }
        return ladoA;
    }

    public static double peticionLadoB() {
        double ladoB;
        System.out.println("Ingrese el valor del LadoB");
        ladoB = leer.nextDouble();
        while (ladoB <= 0) {
            System.out.println("Ingrese un numero valido");
            ladoB = leer.nextDouble();
        }
        return ladoB;
    }

    public static double peticionAltura() {
        double altura;
        System.out.println("Ingrese el valor de la Altura");
        altura = leer.nextDouble();
        while (altura <= 0) {
            System.out.println("Ingrese un numero valido");
            altura = leer.nextDouble();
        }
        return altura;
    }

    public static double peticionBaseMayor() {
        double baseMayor;
        System.out.println("Ingrese el valor de la base mayor");
        baseMayor = leer.nextDouble();
        while (baseMayor <= 0) {
            System.out.println("Ingrese un numero valido");
            baseMayor = leer.nextDouble();
        }
        return baseMayor;
    }

    public static double peticionBaseMenor() {
        double baseMenor;
        System.out.println("Ingrese el valor de la base menor");
        baseMenor = leer.nextDouble();
        while (baseMenor <= 0) {
            System.out.println("Ingrese un numero valido");
            baseMenor = leer.nextDouble();
        }
        return baseMenor;
    }

    public static double peticionLado1() {
        double lado1;
        System.out.println("Ingrese el valor del Lado1");
        lado1 = leer.nextDouble();
        while (lado1 <= 0) {
            System.out.println("Ingrese un numero valido");
            lado1 = leer.nextDouble();
        }
        return lado1;
    }
    
    public static double peticionLadoRepitente() {
        double lado1;
        System.out.println("Ingrese el valor del lado que se repite");
        lado1 = leer.nextDouble();
        while (lado1 <= 0) {
            System.out.println("Ingrese un numero valido");
            lado1 = leer.nextDouble();
        }
        return lado1;
    }

    public static double peticionLado2() {
        double lado2;
        System.out.println("Ingrese el valor del Lado2");
        lado2 = leer.nextDouble();
        while (lado2 <= 0) {
            System.out.println("Ingrese un numero valido");
            lado2 = leer.nextDouble();
        }
        return lado2;
    }

    public static double peticionLado3() {
        double lado3;
        System.out.println("Ingrese el valor del Lado3");
        lado3 = leer.nextDouble();
        while (lado3 <= 0) {
            System.out.println("Ingrese un numero valido");
            lado3 = leer.nextDouble();
        }
        return lado3;
    }
    public static boolean comprobarTriangulo(Triangulo t){
     if (!t.esTriangulo()) {
            System.out.println("Los datos ingresados no corresponden a un Triangulo");
            System.out.println("Ingrese los datos denuevo");
            return true;
        }
     return false;
    }

    public static boolean comprobarIsoceles(Isoceles i) {
        if (comprobarTriangulo(i)){
            return true;
        }else if (!i.esIsoceles()) {
            System.out.println("Los datos ingresados no corresponden a un Triangulo Isoceles");
            System.out.println("Ingrese los datos denuevo");
            return true;
        }
        return false;
    }
    
    public static boolean comprobarEscaleno(Escaleno e) {
        if (comprobarTriangulo(e)){
            return true;
        }else if (!e.esEscaleno()) {
            System.out.println("Los datos ingresados no corresponden a un Triangulo Escaleno");
            System.out.println("Ingrese los datos denuevo");
            return true;
        }
        return false;
    }
    
    public static boolean comprobarEquilatero(Equilatero e) {
        if (comprobarTriangulo(e)){
            return true;
        }else if (!e.esEquilatero()) {
            System.out.println("Los datos ingresados no corresponden a un Triangulo Isoceles");
            System.out.println("Ingrese los datos denuevo");
            return true;
        }
        return false;
    }

    public static void printShapeAreaAndPerimeter(Forma f) {
        System.out.println(f + "\n");
    }

}
