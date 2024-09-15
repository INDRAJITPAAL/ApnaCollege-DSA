public class practticeIntheritance {
    public static void main(String[] args) {
        Vehicle ob1 = new Car();
        ob1.print();
        Vehicle ob2 = new Vehicle();
        ob2.print();

    }

}

class Vehicle {
    void print() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {

    void print() {
        System.out.println("car");
    }
}
