public class w3sInterface {
    public static void main(String[] args) {
        Farari c = new Farari();
        c.carModel();
    }
}

interface Car {
    public void carColor();

    public void carModel();
}

class Farari implements Car {
    public void carColor() {
        System.out.println("red");
    }

    public void carModel() {
        System.out.println("carModel is latest");
    }
}