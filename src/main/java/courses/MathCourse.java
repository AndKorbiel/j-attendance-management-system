package courses;

import staff.Teacher;

public class MathCourse extends Course {
  public MathCourse(Teacher courseTeacher, int availableSeats) {
    super("Math course for students", "Math course", courseTeacher, availableSeats);
  }
}
