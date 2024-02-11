import java.util.*;

class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String studentNumber, String name, String program) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.program = program;
        this.courses = new ArrayList<>();
    }

    // Getter and setter methods
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getTotalUnitsEnrolled() {
        int totalUnitsEnrolled = 0;
        for (Course course : courses) {
            totalUnitsEnrolled += course.getUnit();
        }
        return totalUnitsEnrolled;
    }
}