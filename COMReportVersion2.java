import java.util.*;
import java.io.*;

public class COMReportVersion2 {
    public static void main(String[] args) throws FileNotFoundException {

        BlockSectionDA blockSectionDA = new BlockSectionDA();

        ArrayList<BlockSection> blockSections = blockSectionDA.getBlockSectionList();

        for (BlockSection blockSection : blockSections) {
            System.out.println("Block Section Code: " + blockSection.getBlockCode());
            System.out.println("Description: " + blockSection.getDescription());
            System.out.println("Adviser: " + blockSection.getAdviser());
            System.out.println("Total Students: " + blockSection.getTotalStudent() + "\n");

            ArrayList<Student> students = blockSection.getStudents();
            for (Student student : students) {
                System.out.println("Student Number: " + student.getStudentNumber());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Program: " + student.getProgram());
                System.out.println("Total Units Enrolled: " + student.getTotalUnitsEnrolled());

                ArrayList<Course> courses = null;
                try {
                    courses = new CourseDA(student.getStudentNumber()).getCourses();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

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



