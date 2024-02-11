public class Course {
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getDescription() {
        return description;
    }

    public Integer getUnit() {
        return unit;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-30s %d\t%-10s %-15s", courseCode, description, unit, day, time);
    }
}
