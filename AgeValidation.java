import java.util.Scanner;

// Custom exception class
class WrongAge extends Exception {
    // Default constructor
    public WrongAge() {
        super("Age Error");
    }

    // Parameterized constructor
    public WrongAge(String message) {
        super(message);
    }
}

// Father class
class Father {
    protected int fatherAge;

    // Constructor
    public Father() throws WrongAge {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();

        // Throw exception if age is negative
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }
}

// Son class
class Son extends Father {
    private int sonAge;

    // Constructor
    public Son() throws WrongAge {
        super(); // Call the parent class constructor

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();

        // Throw exception if son's age is invalid
        if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
    }

    // Method to display the son's age
    public void display() {
        System.out.println("Son's Age: " + sonAge);
    }
}

// Main class
public class AgeValidation {
    public static void main(String[] args) {
        System.out.println("Name: Kavana M A, USN: 1BM23CS145");
        try {
            // Create a Son object
            Son son = new Son();
            son.display(); // Display son's age
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
