import java.util.Scanner;

public class Scanner1 {
    public static void main(String args[]) {
        // create scanner class object
        Scanner $obj = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = $obj.nextLine();
        System.out.println("Enter your age");
        int age = $obj.nextInt();
        System.out.println("Enter your gender");

        // char gender = $obj.next().charAt(0); first character
        String gender = $obj.next();
        System.out.println("Enter your mobile number");
        long number = $obj.nextLong();
// ==============================================================================
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("gender is "+gender);
        System.out.println("mobile number is "+number);
    }
}
