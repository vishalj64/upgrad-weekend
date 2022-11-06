package Session3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String add = sc.next();

        Account acc1 = new Account("vishal", "mum", 567890,
                9876543210l, "abb", 3216549877888l,
                "abcgmail.com", false, 5580.25);

        System.out.println(acc1);


        System.out.println(acc1.getBalance());
        System.out.println(acc1.getAddress());
        acc1.setAddress("Pune");
        System.out.println(acc1.getAddress());
//        double amt = sc.nextDouble();
//        double newBal = acc1.deposit(amt);
//
//        System.out.println(newBal);
//
//        System.out.println(acc1.withdrawal(666));

    }
}
