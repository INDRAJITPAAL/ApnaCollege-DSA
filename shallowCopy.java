public class shallowCopy {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.mark[0] = 100;
        p1.mark[1] = 10;
        p1.mark[2] = 50;
        Person p2 = new Person(p1);
        p2.mark[0] = 111;
        System.out.println(p1.mark[0]);
        System.out.println(p2.mark[0]);
    }
}

class Person {
    int mark[] = new int[3];

    Person(Person p1) {
        this.mark = p1.mark;
    }

    Person() {

    }
}