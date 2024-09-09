public class constructtorOverLoading {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("indrajit");
        System.out.println(s2.name);
        Student s3=new Student(123);
        System.out.println(s3.roll);

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("this is called constructor");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
