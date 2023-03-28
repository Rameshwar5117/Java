import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffereReader1 {
    public static void main(String args[]) {
        InputStreamReader $input = new InputStreamReader(System.in);
        BufferedReader $buffer = new BufferedReader($input);
        try {
            System.out.println("enter your name");
            String name = $buffer.readLine();
            System.out.println("enter your age");
            int age = Integer.parseInt($buffer.readLine());

            System.out.println("name:- " + name);
            System.out.println("age:- " + age);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
