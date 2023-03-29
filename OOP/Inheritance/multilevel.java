class Animal1 {
    void eating() {
        System.out.println("Eating");
    }
}

class Dog1 extends Animal1 {
    void running() {
        System.out.println("Running");
    }
}

class Tommy extends Dog1 {
    void Attack() {
        System.out.println("Attack at night");
    }
}

public class multilevel {
    public static void main(String args[]) {

        // Tommy tommy = new Tommy();
        // tommy.eating();
        // tommy.running();
        // tommy.Attack();

        Dog1 dog1 = new Dog1();
        dog1.eating();
        dog1.running();
        // dog1.Attack(); //error
    }
}
