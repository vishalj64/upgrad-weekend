package Session5;

public class Test {

    public static void main(String[] args) {
        ChildClass c = new ChildClass(11, "Vishjal", true, 'M');
         c.greet();
        System.out.println(c.num);

        Car c1 = new Car();
        c1.applyBrakes();

        Circle circle = new Circle(5);
        circle.calculateArea();


        Rectangle r = new Rectangle(10, 5);
        r.calculatePerimeter();


    }
}
