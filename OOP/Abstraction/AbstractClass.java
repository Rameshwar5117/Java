//1 class method can abstract or not
//2 abstract class can;t make constructor

abstract class Vehiecle{
   abstract public void start();
}
class Cars extends Vehiecle{
    public void start(){
        System.out.println("Start with key");
    }
} 
class Bike extends Vehiecle{
    public void start(){
        System.out.println("Start with kick");
    }
}
public class AbstractClass {
    public static void main(String args[]){
        Vehiecle obj2 = new Cars();
        obj2.start();
        
        Vehiecle obj1 = new Bike();
        obj1.start();
    }
}
