package datos;

public abstract class Cuadrilatero extends Forma {
    private double ladoA;
    private double ladoB;
    
    public Cuadrilatero(double ladoA,double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    public Cuadrilatero(double ladoA){
        this.ladoA = ladoA;
        this.ladoB = ladoA;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }
}