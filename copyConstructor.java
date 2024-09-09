public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "indrajit";
        s1.roll = 456;
        s1.password = "ssdsdf";
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "dkfjhgkdhf";
        s2.mark[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.mark[i]);
        }
    }
}

class Student {

    String name;
    int roll;
    String password;
    int mark[] = new int[3];

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.mark=new int[s1.mark.length];
        for(int i=0;i<mark.length;i++){
            this.mark[i]=s1.mark[i];
        }
    }

    Student() {

    }

  

}