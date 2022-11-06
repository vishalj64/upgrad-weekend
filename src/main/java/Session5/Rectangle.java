package Session5;

public class Rectangle extends AnyShape{

    public int length;

    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println((length*breadth));

    }
    public void calculatePerimeter() {
        System.out.println(2 * (length+breadth));

    }
}
