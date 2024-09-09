
// Encapsulation example in Java
class Employee {
    // Private variables to restrict access
    private String name;
    private int age;

    // Public getter and setter methods to access private variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) { // Simple validation to demonstrate control
            this.age = age;
        } else {
            System.out.println("Age should be greater than 18.");
        }
    }
}

public class ExampleOfEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Set employee details
        emp.setName("John Doe");
        emp.setAge(25);

        // Get and display employee details
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
