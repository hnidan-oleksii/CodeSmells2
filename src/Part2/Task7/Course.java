package Part2.Task7;

import java.util.List;

public class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
    // Додаткові методи...
}
