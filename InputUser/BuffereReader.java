import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuffereReader {
    public static void main(String args[])
            throws IOException {

        BufferedReader $reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name");
        String name = $reader.readLine();
        System.out.println("enter your age");
        int age = Integer.parseInt($reader.readLine());

        System.out.println("name:- "+name);
        System.out.println("age:- "+age);
        
    }
}
