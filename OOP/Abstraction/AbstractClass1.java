abstract class Bank {
    abstract public void getInterest();
}

class HDFC extends Bank {
    public void getInterest() {
        System.out.println("7.1%");
    }
}

class BOI extends Bank {
    public void getInterest() {
        System.out.println("7.9%");
    }
}

class ICICI extends Bank {
    public void getInterest() {
        System.out.println("8.4%");
    }
}

public class AbstractClass1 {
    public static void main(String args[]) {
        Bank bank1 = new HDFC();
        Bank bank2 = new BOI();
        Bank bank3 = new ICICI();

        bank1.getInterest();
        bank2.getInterest();
        bank3.getInterest();
    }
}
