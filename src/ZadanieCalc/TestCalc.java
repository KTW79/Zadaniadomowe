package ZadanieCalc;

/**
 * Created by Kasia on 28.12.2016.
 */
public class TestCalc {
    public static void main(String[] args) {
        ShapeCalc shapeCalc = new ShapeCalc();
        System.out.println(shapeCalc.squareArea());
        System.out.println(shapeCalc.circleArea());
        System.out.println(shapeCalc.rectPerimeter());
        System.out.println(shapeCalc.trianglePerimeter());

        Square square = new Square(3);
        double squarePerimeter = square.squarePerimeter();
        System.out.println(squarePerimeter);

        Circle circle = new Circle(4);
        double circlePerimeter = circle.circlePerimeter();
        System.out.println(circlePerimeter);

        Rectangle rectangle = new Rectangle(2,3);
        double rectangleArea = rectangle.rectangleArea();
        System.out.println(rectangleArea);

        Triangle triangle = new Triangle(5,4);
        double triangleArea = triangle.triangleArea();
        System.out.println(triangleArea);
    }



}