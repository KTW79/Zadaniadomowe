package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class ShapeCalc {//w tym zadaniu pomógł mi Szymon, niestety nie byłam taka sprytna

    Square square = new Square(3);
    Circle circle = new Circle(2);
    Triangle triangle = new Triangle(6,3);
    Rectangle rectangle = new Rectangle(5,7);

    public double squareArea() {
        double result = Math.pow(square.getA(),2);
        return result;
    }

    double	circleArea(){
        double result = 3.14*Math.pow(circle.getR(),2);
        return result;
    }
    double	trianglePerimeter(){
        double result=triangle.getA()+ triangle.getB()+triangle.getC();
        return result;
    }

    double	rectPerimeter(){
        double result=(rectangle.getA()*2)+(rectangle.getB()*2);
        return result;
    }





}
