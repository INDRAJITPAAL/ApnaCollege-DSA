public class hybrideInheritance {
    public static void main(String[] args) {
Tuna f1=new Tuna();
f1.swim();
    }
}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }

    void runFastter() {
        System.out.println("runFaster");
    }

    void pruduceMilk() {
        System.out.println("produceMilk");
    }

    void swim() {
        System.out.println("swims");
    }

    void peocockSound(){
        System.out.println("co co co");
    }

}

// <--------------------------------------------------------->
class Fish extends Animal {

    // access data from animal class

}

class Bird extends Animal {

    // access data from animal class
}

class Mammal extends Animal {
    // access data from animal class
}

// <------------------------------------------------------------------->

class Tuna extends Fish {
    // access data form Fish class
}

class Peocock extends Bird {
    // access data from Bird class
}

class Dog extends Mammal {
    // access data from Mammals class
}