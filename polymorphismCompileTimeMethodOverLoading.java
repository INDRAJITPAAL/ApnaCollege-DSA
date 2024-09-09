public class polymorphismCompileTimeMethodOverLoading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(3, 4));
        System.out.println(cal.sum(3.6f, 4.7f));
        System.out.println(cal.sum(3, 4, 7));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}