import java.util.*;
import java.io.*;

class StudentDA {
    private ArrayList<Student> studentList;

    public StudentDA(String blockCode) throws FileNotFoundException {
        studentList = new ArrayList<>();
        Scanner blockSectionStudentFile = new Scanner(new FileReader("studentInfo.csv"));

        while (blockSectionStudentFile.hasNext()) {
            String blockSectionRaw = blockSectionStudentFile.nextLine();
            String[] blockSectionArray = blockSectionRaw.split(",");

            if (blockSectionArray[0].trim().equals(blockCode)) {
                Student student = new Student(blockSectionArray[1].trim(), blockSectionArray[2].trim(), blockSectionArray[3].trim());
                studentList.add(student);
            }
        }
        blockSectionStudentFile.close();
    }

    public ArrayList<Student> getStudents() {
        return studentList;
    }
}
