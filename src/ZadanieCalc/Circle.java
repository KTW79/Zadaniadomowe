package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Circle {
    private double r;
    private double pi;

    public double getR() {
        return r;
    }


    public void setR(double r) {
        this.r = r;
    }
//konstruktor do zad.3
    public Circle(double r) {
        this.r = r;
    }
//metoda na obwód koła
    public double circlePerimeter(){
        double result = 2*3.14*r;
        return result;
    }
}
