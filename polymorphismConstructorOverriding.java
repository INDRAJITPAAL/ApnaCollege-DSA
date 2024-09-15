public class polymorphismConstructorOverriding {
    public static void main(String[] args) {
        Color c = new Pink();
    }

}

class Color {
    Color() {
        System.out.println("color called");
    }
}

class Red extends Color {
    Red() {
        System.out.println("Red color");
    }
}

class Pink extends Color {
    Pink() {
        System.out.println("Pin color");
    }
}