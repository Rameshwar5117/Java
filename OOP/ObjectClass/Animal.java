import java.util.jar.Attributes.Name;

public class Animal {
    String name;
    int age;

    public void setValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getValue() {
        System.out.println("Name is " + this.name + " and color is " + age);
    }

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {
        // Animal $obj = new Animal();
        // 1.
        // ================================= call by value ====================================================
        // initilized object -->call by value
        // $obj.name = "Cow";
        // $obj.age = 10;
        // System.out.println($obj.name+" "+$obj.age);

        // 2.
        // ================================== Using method =====================================================
        // Animal $obj = new Animal();
        // $obj.setValue("Dog", 5);
        // $obj.getValue();
        // System.out.println($obj.name + " " + $obj.age);

        // 3. ================================== Using Constructor =================================================
        Animal $obj = new Animal("Lion", 17);
        System.out.println($obj.name + " " + $obj.age);
    }
}
