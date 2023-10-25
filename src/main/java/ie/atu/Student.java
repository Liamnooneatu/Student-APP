package ie.atu;
public class Student {
    private String name;
    private String email;
    private String course;

    // Default constructor
    public Student() {    }

    public Student(String name, String email, String course) {
        // Initialize the instance variables with the provided parameters
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getEmail() {
        return email;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }
    // Getter
    public String getCourse() {
        return course;
    }

    // Setter
    public void setCourse(String course) {
        this.course = course;
    }
}





