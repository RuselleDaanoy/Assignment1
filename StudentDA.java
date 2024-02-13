import java.util.*;
import java.io.*;

public class StudentDA {
    private ArrayList<Student> studentList;

    public StudentDA(String blockCode) throws FileNotFoundException {
        studentList = new ArrayList<>();
        Scanner studentScanner = new Scanner(new FileReader("studentInfo.csv"));

        while (studentScanner.hasNextLine()) {
            String studentLine = studentScanner.nextLine();
            String[] studentData = studentLine.split(",");

            if (studentData.length >= 4 && studentData[0].trim().equals(blockCode)) {
                Student student = new Student();
                student.setStudentNumber(studentData[1].trim());
                student.setName(studentData[2].trim());
                student.setProgram(studentData[3].trim());

                CourseDA courseDA = new CourseDA();
                ArrayList<Course> courses = courseDA.getCourses(student.getStudentNumber());
                for (Course course : courses) {
                    student.addCourse(course);
                }

                studentList.add(student);
            }
        }
        studentScanner.close();
    }

    public ArrayList<Student> getStudents() {
        return studentList;
    }
}