class Animal {
    void eat() {
        System.out.println("Eating...");
    }
    void eat(String name) {
        System.out.println("Eating..."+name);
    }
}

class Cow extends Animal {
    void eat(int s) {
        System.out.println("Eating...1");
    }
}

public class ovverloading {
    public static void main(String args[]) {
        Cow cow = new Cow();
        cow.eat("ram");
        // cow.milking();
    }
}
