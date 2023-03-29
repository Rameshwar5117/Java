class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("running...");
    }
}

public class singleInheritance{
    public static void main(String args[]){
        //1. parent class object
        Animal parent = new Animal();
        parent.eat();
        // parent.run(); //error because parent class can't call child class method

        //2. chil class object
        Dog child = new Dog();
        child.eat();
        child.run();

        //3 parent refence variable 
        Animal AnimalRefence = new Dog();
        AnimalRefence.eat();
        // AnimalRefence.run();

        //4 child reference variable -->can't
        Dog DogRefence = new Animal();
        DogRefence.eat();
        DogRefence.run();
    }
}