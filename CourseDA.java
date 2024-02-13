import java.util.*;
import java.io.*;

class CourseDA {
    private ArrayList<Course> courseList;

    public ArrayList<Course> getCourses(String studentNumber) throws FileNotFoundException {
        courseList = new ArrayList<>();
        try (Scanner courseFile = new Scanner(new FileReader("scheduleInfo.csv"))) {
            while (courseFile.hasNext()) {
                String courseRaw = courseFile.nextLine();
                String[] courseArray = courseRaw.split(",");

                if (courseArray[0].trim().equals(studentNumber)) {
                    Course course = new Course();
                    course.setCourseCode(courseArray[1].trim());
                    course.setDescription(courseArray[2].trim());
                    course.setUnit(Integer.parseInt(courseArray[3].trim()));
                    course.setDay(courseArray[4].trim());
                    course.setTime(courseArray[5].trim());
                    courseList.add(course);
                }
            }
        }
        return courseList;
    }
}