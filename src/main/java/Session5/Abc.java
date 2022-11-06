package Session5;

public class Abc {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static float sum(float num1, float num2) {
        return num1 + num2;
    }
    public void greet(String gender,char name) {
        System.out.println("greet method");
    }

    public static int sum(int num1, int num2, String num3) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
    public static void main(String[] args) {
        Abc a = new Abc();
        System.out.println(sum(12, 20));
        System.out.println(sum(12, 20, "11"));
        System.out.println(sum(12, 20, 11, 10));

        a.greet("Vishal", 'M');

    }
}
