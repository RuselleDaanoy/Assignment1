import java.util.ArrayList;

class Student {
    private String studentNumber;
    private String name;
    private String program;
    private int totalUnitsEnrolled;
    private ArrayList<Course> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    // Other methods

    public void addCourse(Course course) {
        courses.add(course);
        updateTotalUnitsEnrolled();
    }

    private void updateTotalUnitsEnrolled() {
        totalUnitsEnrolled = courses.stream().mapToInt(Course::getUnit).sum();
    }

    // Getters and setters

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

    public int getTotalUnitsEnrolled() {
        return totalUnitsEnrolled;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
