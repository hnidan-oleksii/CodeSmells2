package Part2.Task7;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        course.enrollStudent(this);
        courses.add(course);
    }
    // Додаткові методи...
}
