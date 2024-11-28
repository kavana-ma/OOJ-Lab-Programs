class CollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted: " + e.getMessage());
        }
    }
}

// Thread to display "CSE" every 2 seconds
class CSEThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted: " + e.getMessage());
        }
    }
}

// Main class to run the threads
public class DisplayMessages {
    public static void main(String[] args) {
        System.out.print("Name: Kavana M A, USN: 1BM23CS145");
        // Create threads
        CollegeThread collegeThread = new CollegeThread();
        CSEThread cseThread = new CSEThread();

        // Start threads
        collegeThread.start();
        cseThread.start();
    }
}
