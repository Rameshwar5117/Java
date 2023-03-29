public class CopyConstructor {
    int age;
    String name;

    CopyConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    CopyConstructor(CopyConstructor obj){
        this.age = obj.age;
        this.name = obj.name;
    }
    void display1() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        CopyConstructor obj = new CopyConstructor(27, "Rameshwar");
        CopyConstructor obj1 = new CopyConstructor(obj);
        obj.display1();
        obj1.display1();
    }
}
