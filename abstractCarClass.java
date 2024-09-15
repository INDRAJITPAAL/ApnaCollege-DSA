abstract class Car {
    // Static block in Car, executed when the class is loaded
    static {
        System.out.println("1 - Static block in Car");
    }

    // Constructor of Car, called when a Car or its subclass is instantiated
    public Car(String name) {
        super();
        System.out.println("2 - Constructor in Car");
    }

    // Instance initializer block in Car, executed before the constructor
    {
        System.out.println("3 - Instance initializer block in Car");
    }
}

class BlueCar extends Car {
    // Instance initializer block in BlueCar, executed before the constructor
    {
        System.out.println("4 - Instance initializer block in BlueCar");
    }

    // Constructor of BlueCar
    public BlueCar() {
        super("Blue");  // Calls the Car constructor
        System.out.println("5 - Constructor in BlueCar");
    }

    public static void main(String[] args) {
        // Instantiates a new BlueCar, triggering the whole sequence
        new BlueCar();
    }
}
