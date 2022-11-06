import java.util.Scanner;

public class Session_2_0910 {

    public static void main(String[] args) {


        int a = 10;
        int b = 20;

//        System.out.println(a+b);
//        int res = a+b;
//        System.out.println(res);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        ++a;// a= a+1
//        a++;
//        System.out.println(a);
//        --a;// a= a-1
//        System.out.println(a);

//        System.out.println(a++);
//        System.out.println(a);
//
//        System.out.println(!false);
//
//        System.out.println(10>=10);
//
//        System.out.println(5<=5);

//        int age = 200;
//        boolean isPartnerAvailable = true;
//        if(age >= 18) {
//            if(isPartnerAvailable) {
//                System.out.println("You are allowed");
//            } else {
//                System.out.println("partner is needed to get entry");
//            }
//        } else {
//            System.out.println("You are not allowed");
//        }

        // mon, tue, wed, thu, fri, sat, sun

//        String day = "Mon";
//        if(day == "Mon") {
//            System.out.println("Do back workout");
//            System.out.println("take massage");
//            System.out.println("eat and sleep well");
//        }else if(day == "Tue") {
//            System.out.println("Do biceps workout");
//        }else if(day == "Wed") {
//            System.out.println("Do chest workout");
//        }else if(day == "Thu") {
//            System.out.println("Do triceps workout");
//        }else if(day == "Fri") {
//            System.out.println("Do shoulder workout");
//        }else if(day == "Sat") {
//            System.out.println("Do thighs workout");
//        }else if(day == "Sun") {
//            System.out.println("Do rest");
//        }else {
//            System.out.println("invalid day");
//        }

//        System.out.println("-------");

//        switch (day) {
//            case "Mon":
//                System.out.println("Do back workout");
//                System.out.println("take massage");
//                System.out.println("eat and sleep well");
//
//                break;
//            case "Tue":
//                System.out.println("Do biceps workout");
//                break;
//            case "Wed":
//                System.out.println("Do chest workout");
//                break;
//            case "Thu":
//                System.out.println("Do triceps workout");
//                break;
//            case "Fri":
//                System.out.println("Do shoulder workout");
//                break;
//            case "Sat":
//                System.out.println("Do thighs workout");
//                break;
//            case "Sun":
//                System.out.println("Do rest");
//                break;
//            default:
//                System.out.println("invalid day");
//
//        }
//

        // 18 to 50 -> vaccine 1
        // 50+ -> vaccine 2
        // <18 -> vaccine 3

//        if(age >= 18 && age <=50) {
//            System.out.println("Vaccine 1");
//        } else if( age < 18){
//            System.out.println("Vaccine 3");
//        } else {
//
//        }





//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        for(int i = 1; i <= 5; ++i) {
//            int inp = sc.nextInt();
//            sum = sum + inp;
//        }
//        System.out.println(sum);

        // ask user a value and keep calculate the sum
      //  until and unless user give me negative value

        //Scanner sc = new Scanner(System.in);

//        int inp = sc.nextInt();
//        int sum = 0;
//        while(inp > 0) {
//            sum = sum + inp;
//            inp = sc.nextInt();
//        }
//
//        System.out.println(sum);
//        int sum = 0;
//        int inp;
//        do {
//            inp = sc.nextInt();
//            sum = sum + inp;
//        } while(inp > 0);
//
//        System.out.println("res" + sum);



//        while(i <= 5){
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(i);
//            i++;
//        } while(i <= 5);


// break - means break the loop
        // continue - forget next lines, continue to next iteration

        for (int i = 0; i< 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("end of loop");

        boolean bool = 2456%2 == 0;
        System.out.println(bool);


    }
}
