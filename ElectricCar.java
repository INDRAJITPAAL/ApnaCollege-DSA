class Automobile {
    // The private method is not inherited, so it should be protected or public for inheritance
    protected String drive() {
        return "Driving vehicle";
    }
}
//Automobile->Car->Electric car
class Car extends Automobile {
    @Override
    public String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    @Override
    public String drive() {
        return "Driving electric car";
    }

    public static void main(String[] args) {
        Automobile car = new Car();
        System.out.print(car.drive());
    }
}
