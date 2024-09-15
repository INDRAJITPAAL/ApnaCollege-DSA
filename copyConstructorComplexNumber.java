public class copyConstructorComplexNumber {
    public static void main(String[] args) {
        CpN c1 = new CpN(10, 1);
        CpN c2 = new CpN(2, 2);
        CpN cal = c1.add(c2);
        cal.dispaly();

    }
}

class CpN {
    double realN;
    double imagN;

    CpN(double realN, double imagN) {
        this.realN = realN;
        this.imagN = imagN;
    }

    public CpN add(CpN other) {
        return new CpN(this.realN + other.realN, this.imagN + other.imagN);
    }

    void dispaly() {
        System.out.println(realN + " + " + imagN + "i");
    }

}