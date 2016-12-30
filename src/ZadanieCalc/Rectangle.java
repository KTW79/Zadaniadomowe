package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Rectangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
//konstruktor do zad.3
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
//metoda na pole prostokąta
    public double rectangleArea(){
        double result=a*b;
        return result;
    }

}
