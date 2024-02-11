import java.util.ArrayList;

class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private ArrayList<Student> students;

    // Constructor
    public BlockSection() {
        students = new ArrayList<>();
    }

    // Other methods

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Getters and setters

    public String getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getTotalStudent() {
        return students.size();
    }
}
