import java.io.Console;
class Console1 {
    public static void main(String args[]) {
        // System.out.println("hello");
        Console c = System.console();
        System.out.println("Enter your name");
        String name = c.readLine();

        System.out.println("Enter your age");
        // String age = c.readLine();
        int age = Integer.parseInt( c.readLine());

        System.out.println("name:-"+name);
        System.out.println("age:-"+age);
    }
}