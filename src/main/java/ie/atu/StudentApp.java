package ie.atu;

// Import the Scanner class to read user input
import java.util.Scanner;

// Define's the StudentApp class
public class StudentApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create the first student using setters
        System.out.println("Enter the name of the first student: ");
        String name1 = scanner.nextLine();
        Student student1 = new Student(); // Create an instance of Student using the default constructor
        student1.setName(name1); // Set the name using the setName method

        // Prompt the user for email and course, then set them using setters
        System.out.println("Enter the email of the first student: ");
        String email1 = scanner.nextLine();
        student1.setEmail(email1);

        System.out.println("Enter the course of the first student: ");
        String course1 = scanner.nextLine();
        student1.setCourse(course1);


        // Create the second student using a constructor
        System.out.println("Enter the name of the second student: ");
        String name2 = scanner.nextLine();

        System.out.println("Enter the email of the second student: ");
        String email2 = scanner.nextLine();

        System.out.println("Enter the course of the second student: ");
        String course2 = scanner.nextLine();

        Student student2 = new Student(name2, email2, course2);
    };;
