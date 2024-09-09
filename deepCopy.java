public class deepCopy {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.mark[0] = 100;
        p1.mark[1] = 200;
        p1.mark[2] = 300;
        Person p2 = new Person(p1);
        p2.mark[0] = 400;
        System.out.println(p1.mark[0]);
        System.out.println(p2.mark[0]);
    }
}

// deep copy
class Person {
    int mark[]=new int[3];

    Person(Person p1) {
        int mark[]=new int[p1.mark.length];
        for (int i = 0; i < mark.length; i++) {
            this.mark[i] = mark[i];
        }
    }

    Person() {

    }
}