package Activities;

public class Car {
    String color,transmission;
    int make,tyres,doors;

    Car()
    {
        tyres=4;
        doors=4;

    }
    public void displayCharacteristics()
    {
        System.out.println("color " + color);
        System.out.println("transmission " + transmission);
        System.out.println("make " + make);
        System.out.println("tyres " + tyres);

    }
    public void accelerate()
    {
        System.out.println("car is moving forward");

    }
    public void brake()
    {
        System.out.println("Car has stopped");
    }

}
