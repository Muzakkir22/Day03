package myapp.core;

public class Main {

    public static void main(String[] args) {
        // Instantiate a car
        Car myCar = new Car();
        myCar.setColour("red");
        //myCar.colour = "red";
        //myCar.make = "honda";
        //myCar.engineCapacity = 2000;

        myCar.start();

        System.out.printf("The colour of my car is %s\n", myCar.colour);


        myCar.setcolour = "blue";
        System.out.printf("I have changed colour of my car to %s\n", myCar.colour);

        // Instantiate another car
        Car myOtherCar = new Car();
        //myOtherCar.colour = "yellow";
        //myOtherCar.make = "ferrari";
        //myOtherCar.engineCapacity = 3000;

        System.out.printf("The engineCapacity is %s\n", myOtherCar.engineCapacity);

        myOtherCar.stop();

        Car myThirdCar = new Car("silver", "subaru");
        myThirdCar = "subaru";

        // Honda
        Honda civic = new Honda();
        System.out.printf("Make of car: %s\n", civic.getMake);
                

    }
    
}
