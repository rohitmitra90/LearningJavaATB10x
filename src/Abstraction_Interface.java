package JavaBasics.OOPs;

public class Abstraction2 {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.StartEngine();
        t.StopEngine();
        t.ChangeOil();
        t.Car();
        t.House();
        Rohit r = new Rohit();
        r.Car();
        r.House();
    }
}
abstract class Engine{
    abstract void StartEngine();
    abstract void StopEngine();
    void ChangeOil(){
        System.out.println("This car oil needs to be changed");
    }
}
class Tesla extends Engine implements I{

    @Override
    void StartEngine() {
        System.out.println("Tesla will auto electric start");
    }

    @Override
    void StopEngine() {
        System.out.println("Tesla will auto electric STOP");
    }

    @Override
    public void Car() {
        System.out.println("Tesla InterFACED Car");
    }

    @Override
    public void House() {
        System.out.println("Tesla InterFACED House");
    }
}
interface I{
    void Car();
    void House();
}
class Rohit implements I{

    @Override
    public void Car() {
        System.out.println("I have a car with interface");
    }

    @Override
    public void House() {
        System.out.println("I have a HOUSE with interface");
    }
}