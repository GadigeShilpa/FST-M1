public class Activity1 {

    public static void main(String[] args) {
        Car Amaze = new Car();
        Amaze.make = 2014;
        Amaze.color = "Black";
        Amaze.transmission = "Manual";

        Amaze.displayCharacteristics();
        Amaze.accelarate();
        Amaze.brake();
    }
}
