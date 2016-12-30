package ZadanieTriangle;

/**
 * Created by Kasia on 30.12.2016.
 */
public class Test1Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(90);
        RightTriangle rightTriangle = new RightTriangle();
        System.out.println(rightTriangle.isRightTriangle());
    }
}
