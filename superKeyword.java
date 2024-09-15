public class superKeyword {
  
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
     String color;
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {

    Horse() {
       super(); // Explicitly calling the Animal constructor
        super.color = "green"; // Assigning the color in Animal class
        System.out.println("Horse constructor called");
    }

}
