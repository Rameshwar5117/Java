public class Constructor1 {
    String name;
    int age;

    Constructor1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String args[]){
        Constructor1 obj = new Constructor1("Rameshwar", 26);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
