public class importantCodeToUnderstand {

    public static void main(String[] args) {
        A a = new BAC();

    }
}

class A {
    static {
        System.out.println("1");
    }

    public A(String name) {
        // super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

class BAC extends A {
    {
        System.out.println("4");
    }

    public BAC() {
        super("blue");
        System.out.println("5");
    }

}
