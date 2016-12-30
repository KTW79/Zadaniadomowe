package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class Square{

    private double a;


    public double getA() {
        return a;

    }

    public void setA(double a) {
        this.a = a;
    }

//konstruktor do zad.3
    public Square(double a){
        this.a=a;
    }

//metoda na obwód kwadratu
    public double squarePerimeter(){
        double result = 4*a;
        return result;
    }


}

