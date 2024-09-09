public class exampleOfAbstraction {
    public static void main(String[] args) {
       Mustang mu=new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("horse constructor called");
    }

    void changColor() {
        color = "dark brown";
    }

    void eat() {
        System.out.println("horse eats");
    }

    // @Override
    void walk() {
        System.out.println("horse walk with 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void changColor() {
        color = "yellow";
    }

    Chicken() {
        System.out.println("chicken constructer called");
    }

    // @Override
    void walk() {
        System.out.println("chicken wwalk with 2 legs");
    }
}