interface Farmer1 {
    void waterThePlant();
}

interface College {
    void LLB();
}

interface Company {
    void softwareEngineer();
}

class Rameshwar implements Farmer1, Company, College {
    public void waterThePlant() {
        System.out.println("Rameshwar yadav also farmer");
    }

    public void LLB() {
        System.out.println("Rameshwar is a LLB student and he will be become advocate");
    }

    public void softwareEngineer() {
        System.out.println("Rameshwar yadav is a software developer");
    }
}

public class interface2 {
    public static void main(String args[]) {
        Rameshwar farmer = new Rameshwar();
        farmer.waterThePlant();
        farmer.LLB();
        farmer.softwareEngineer();
    }
}
