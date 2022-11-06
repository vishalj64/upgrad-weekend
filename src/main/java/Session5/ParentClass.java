package Session5;

public class ParentClass {

    int num;
    String str;
    boolean isVaccinated;

    public ParentClass(int num, String str, boolean isVaccinated) {
        this.num = num;
        this.str = str;
        this.isVaccinated = isVaccinated;
    }

    void greet() {
        System.out.println("Hello world");
    }
}
