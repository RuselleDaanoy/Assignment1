import java.util.*;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private ArrayList<Student> students;

    // Constructor
    public BlockSection() {
        this.students = new ArrayList<>();
    }

    // Setter methods
    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }
    
    // Getter methods
    public String getBlockCode() {
        return blockCode;
    }

    public String getDescription() {
        return description;
    }

    public String getAdviser() {
        return adviser;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Integer getTotalStudent() {
        return students.size();
    }
}
