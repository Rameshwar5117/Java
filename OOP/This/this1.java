class ThisDemo {

    ThisDemo() {
        this(10);
        System.out.println("No argm constructor");
    }
    ThisDemo(int x) {
        // this();
        System.out.println("argm constructor");
    }
}

public class this1 {
    public static void main(String args[]) {

        // ThisDemo obj = new ThisDemo(99);
        ThisDemo obj = new ThisDemo();
    }
}
