public class constructorConceptInOOPS {
    public static void main(String[] args) {
        Student s1 = new Student("indrajit");
        System.out.println(s1.name);

    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

}