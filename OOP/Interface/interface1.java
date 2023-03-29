interface Farmer{
    void waterThePlant();
}
class Rameshwar implements Farmer{
    public void waterThePlant(){
        System.out.println("Rameshwar yadav also farmer");
    }
}
public class interface1 {
    public static void main(String args[]){
        Farmer farmer = new Rameshwar();
        farmer.waterThePlant();
    }    
}
