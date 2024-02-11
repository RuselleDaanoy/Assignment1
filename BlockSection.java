import java.util.*;

class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private ArrayList<Student> students;

    // Constructor
    public BlockSection(String blockCode, String description, String adviser) {
        this.blockCode = blockCode;
        this.description = description;
        this.adviser = adviser;
        this.students = new ArrayList<>();
    }

    // Getter and setter methods
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

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalStudent() {
        return students.size();
    }
}