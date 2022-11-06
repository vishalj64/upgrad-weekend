package Session5;

public class ChildClass extends ParentClass {

    public char gender;

    public ChildClass(int num, String str, boolean isVaccinated, char gender) {
        super(num, str, isVaccinated);
        this.gender = gender;
    }

    void greet() {
        System.out.println("Hello india");
    }
}
