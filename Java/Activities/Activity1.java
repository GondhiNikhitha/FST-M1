package Activities;

public class Activity1 {
    public static void main(String[] args)
    {
        Car c=new Car();
        c.make=2014;
        c.color="black";
        c.transmission="manual";
        c.displayCharacteristics();
        c.accelerate();
        c.brake();
    }

}
