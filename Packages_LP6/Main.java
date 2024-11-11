import CIE.Internals;
import SEE.Externals;
import CIE.Student;
import java.util.Scanner;

class PrintInfo {
   static void print() {
        System.out.println("Name: Kavana M A");
        System.out.println("USN: 1BM23CS145");
    }
}

public class Main {
    public static void main(String[] args) {
        PrintInfo.print();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        Internals[] cieStudents = new Internals[n];
        Externals[] seeStudents = new Externals[n];
        Student[] students = new Student[n];

        // Input details and marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            cieStudents[i] = new Internals();
            seeStudents[i] = new Externals();
            students[i] = new Student();

            students[i].inputStudentDetails();
            cieStudents[i].inputCIEmarks();
            seeStudents[i].inputSEEmarks();
        }

        // Display final results
        System.out.println("\nFinal Results:");
        for (int i = 0; i < n; i++) {
            students[i].calcFinalMarks(cieStudents[i], seeStudents[i]);
        }
    }
}
