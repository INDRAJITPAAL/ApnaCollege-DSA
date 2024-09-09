public class multipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.swim();
    }
}

interface A {
    void eat();

    void walk();
}

interface B {
    void swim();
}

class Bear implements A, B {
    public void eat() {
        System.out.println("eat both grass and meat");
    }

    public void walk() {
        System.out.println("bear walk with 4 legs");
    }

    public void swim() {
        System.out.println("bear can swim");
    }
}