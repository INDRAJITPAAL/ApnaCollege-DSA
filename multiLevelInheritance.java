public class multiLevelInheritance {
    public static void main(String[] args) {
        Dog dogs=new Dog();
        dogs.eat();
    }
}

class Animal{
    String name;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}

class Mamal extends Animal{
    int fins;
}

class Dog extends Mamal{
    String breed;
}