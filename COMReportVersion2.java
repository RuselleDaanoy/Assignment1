import java.util.ArrayList;
import java.io.*;

public class COMReportVersion2 {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder output = new StringBuilder();

        BlockSectionDA blockSectionDA = new BlockSectionDA();
        ArrayList<BlockSection> blockSections = blockSectionDA.getBlockSectionList();

        for (BlockSection blockSection : blockSections) {
            output.append("Block Section Code: ").append(blockSection.getBlockCode()).append("\n");
            output.append("Description: ").append(blockSection.getDescription()).append("\n");
            output.append("Adviser: ").append(blockSection.getAdviser()).append("\n");
            output.append("Total Students: ").append(blockSection.getTotalStudent()).append("\n\n");

            ArrayList<Student> students = blockSection.getStudents();
            for (Student student : students) {
                output.append("Student Number: ").append(student.getStudentNumber()).append("\n");
                output.append("Student Name: ").append(student.getName()).append("\n");
                output.append("Program: ").append(student.getProgram()).append("\n");
                output.append("Total Units Enrolled: ").append(student.getTotalUnitsEnrolled()).append("\n");

                ArrayList<Course> courses = student.getCourses();
                if (courses != null && !courses.isEmpty()) {
                    output.append("\nCourse Code\tDescription\t\t       Units\tDay\t   Time\n");
                    for (Course course : courses) {
                        output.append(course).append("\n");
                    }
                    output.append("\n");
                } else {
                    output.append("No courses found for this student.\n\n");
                }
            }
        }

        // OUTPUT:
        System.out.println(output.toString());
    }
}




