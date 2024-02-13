import java.util.*;
import java.io.*;

public class COMReportVersion2 {
    public static void main(String[] args) throws FileNotFoundException {

        BlockSectionDA blockSectionDA = new BlockSectionDA();

        ArrayList<BlockSection> blockSections = blockSectionDA.getBlockSectionList();

        for (BlockSection blockSection : blockSections) {
            System.out.println("Block Section Code: " + blockSection.getBlockCode()
                    + "\nDescription: " + blockSection.getDescription()
                    + "\nAdviser: " + blockSection.getAdviser()
                    + "\nTotal Students: " + blockSection.getTotalStudent() + "\n");

            ArrayList<Student> students = blockSection.getStudents();
            for (Student student : students) {
                System.out.println("Student Number: " + student.getStudentNumber()
                        + "\nStudent Name: " + student.getName()
                        + "\nProgram: " + student.getProgram()
                        + "\nTotal Units Enrolled: " + student.getTotalUnitsEnrolled());

                ArrayList<Course> courses = student.getCourses();

                if (courses != null && !courses.isEmpty()) {
                    System.out.println("\nCourse Code\tDescription\t\t       Units\tDay\t   Time");
                    for (Course course : courses) {
                        System.out.println(course);
                    }
                    System.out.println();
                } else {
                    System.out.println("No courses found for this student.\n");
                }
            }
        }
    }
}



