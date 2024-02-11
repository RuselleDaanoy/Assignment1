import java.util.*;
import java.io.*;

public class StudentDA {
    private ArrayList<Student> studentList;

    public ArrayList<Student> getStudents() {
        return studentList;
    }

    public StudentDA(String blockCode) throws FileNotFoundException {
        studentList = new ArrayList<>();
        try (Scanner blockSectionStudentFile = new Scanner(new FileReader("studentInfo.csv"))) {
            while (blockSectionStudentFile.hasNext()) {
                String blockSectionRaw = blockSectionStudentFile.nextLine();
                String[] blockSectionArray = blockSectionRaw.split(",");

                if (blockSectionArray[0].trim().equals(blockCode)) {
                    Student student = new Student();
                    student.setStudentNumber(blockSectionArray[1].trim());
                    student.setName(blockSectionArray[2].trim());
                    student.setProgram(blockSectionArray[3].trim());

                    studentList.add(student);
                }
            }
        }
    }
}