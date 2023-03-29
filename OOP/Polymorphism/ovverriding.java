class Animal {
    void eat() {
        System.out.println("Eating...Animal");
    }
}

class Cow extends Animal {
    void eat() {
        System.out.println("Eating...Cow");
    }
}

public class ovverriding {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.eat();

        Cow cow = new Cow();
        cow.eat();
    }
}
