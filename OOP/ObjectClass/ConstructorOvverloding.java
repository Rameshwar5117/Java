public class ConstructorOvverloding {
    String name;
    int age;
    String city;
    ConstructorOvverloding(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is " + name + " and age " + age);
    }
    ConstructorOvverloding(String name, int age,String city) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is " + name + " and age " + age+" city "+city);
    }

    public static void main(String arrgs[]) {
        ConstructorOvverloding $obj = new ConstructorOvverloding("Rameshwar", 27,"Indore");
        ConstructorOvverloding $obj1 = new ConstructorOvverloding("jyoti", 2);
    }
}