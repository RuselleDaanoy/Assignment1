import java.util.*;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    // Setters
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    // Getters
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Other methods
    public void addCourse(Course course) {
        courses.add(course);
    }

    public Integer getTotalUnitsEnrolled() {
        Integer totalUnitsEnrolled = 0;
        for (Course course : courses) {
            totalUnitsEnrolled += course.getUnit();
        }
        return totalUnitsEnrolled;
    }
}
