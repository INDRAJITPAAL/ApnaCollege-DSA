public class W3SInheritatance {
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object

        // Display the value of the brand attribute (from the Vehicle class) and the
        // value of the modelName from the Car class
        System.out.println(myCar.getName() + " " + myCar.getModelName());
    }
}

class Vehicle {
    private String brand = "Ford"; // Vehicle attribute

    String getName() {
        return brand;
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    String getModelName() {
        return modelName;
    }
}
