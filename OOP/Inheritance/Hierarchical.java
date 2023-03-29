class Farmer {
    void WaterThePlant() {
        System.out.println("WaterThePlant");
    }
}

class Company extends Farmer {
    void makeSoftware() {
        System.out.println("Make a software at 5Exception software solution");
    }
}

class Rameshwar extends Farmer {
    void Hello() {
        System.out.println("Hello Rameshwar");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        Rameshwar obj = new Rameshwar();
        obj.WaterThePlant();
        obj.Hello();

        Company company = new Company();
        company.WaterThePlant();
        company.makeSoftware();
    }
}
