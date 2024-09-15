
public class Shape {
    protected void Display(){
        System.out.println("Display-base");
    }
    public static void main(String[] args) {
        Shape s=new Circle();
        s.Display();
    }
}

