package Session5;

public class Circle extends AnyShape{

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {

        System.out.println(Math.PI  * Math.pow(radius, 2));
    }
    public void calculatePerimeter() {
        System.out.println(2 * Math.PI  * radius);
    }
}
