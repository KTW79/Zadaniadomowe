package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setH(double h) {
        this.h = h;
    }
//konstruktor do zad.3
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
//metoda na obwód trójkąta
    public double triangleArea(){
        double result=0.5*a*h;
        return result;
    }
}
