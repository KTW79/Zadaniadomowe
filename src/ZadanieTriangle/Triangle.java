package ZadanieTriangle;

/**
 * Created by Kasia on 29.12.2016.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private double h;
    private double angle;


    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Triangle(double angle){
        this.setAngle(angle);
    }

    public Triangle(Triangle triangle){
        this(triangle.getAngle());
    }

    public void Triangle(Triangle triangle){//ustawiam wartość kąta 90, dla którego warunek będzie true
        if(angle==90){
            this.angle=angle;
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}



/*
Stwórz	klasę	Triangle	reprezentującą	trójkąt.	Następnie	w	osobnej	klasie	zdefiniuj	metodę:
public	boolean	isRightTriangle(Triangle	triangle){	…	}
która	zwraca	true	jeśli	trójkąt	przekazany	jako	argument	jest	prostokątny	lub	false
jeśli	nie	jest.	Przetestuj	działanie	metody	w	osobnej	klasie.
 */