public class SttaticKeyWord {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        School s1 = new School();

        s1.schoolName = "kdf";
        System.out.println(s1.gettName());
        School s2 = new School();
        System.out.println(s2.gettName());
    }

}

class School {
    int returnAverageMark(int math, int phys, int che) {
        return (math + phys + che) / 3;
    }

    String name;
    int rollNo;
    // using sttattic key word
    static String schoolName;

    @SuppressWarnings("static-access")
    void setNmae(String name) {
        this.schoolName = name;
    }

    @SuppressWarnings("static-access")
    String gettName() {
        return this.schoolName;
    }

}
