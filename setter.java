public class setter {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.settter("indrajit");
        System.out.println(p1.name);
    }
}

class Person {
    protected String name;

    public void settter(String name) {
        this.name = name;
    }
}