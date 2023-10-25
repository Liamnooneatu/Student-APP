
package ie.atu;
// This defines the Student class
public class Student {
    // This class stores variables like student information
    private String name;
    private String email;
    private String course;



    // Default constructor
    public Student() {
        // No need for initialization here, as the user will set values using setters
    }



    // Constructor that takes name, email, and course as parameters
    public Student(String name, String email, String course) {
        // Initialize the instance variables with the provided parameters
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the email
    public String getEmail() {
        return email;
    }

    // Setter method for the email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for the course
    public String getCourse() {
        return course;
    }

    // Setter method for the course
    public void setCourse(String course) {
        this.course = course;
    }
}









