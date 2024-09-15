
public class complexNumberSum {
    public static void main(String[] args) {
        Complex c1 = new Complex(10d, 5d);
        Complex c2 = new Complex(3d, 1d);
        Complex sum = c1.devide(c2);
        sum.display();
    }
}

class Complex {

    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double realPart = (this.real + other.real);
        double imagPart = this.imag + other.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex sub(Complex other) {
        double realPart = (this.real - other.real);
        double imagPart = this.imag - other.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex mul(Complex other) {
        double realPart = (this.real * other.real);
        double imagPart = this.imag * other.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex devide(Complex other) {
        double realPart = (this.real / other.real);
        double imagPart = this.imag / other.imag;
        return new Complex(realPart, imagPart);
    }

    void display() {
        System.out.println(this.real + " " + this.imag + "i");
    }

}