package courses;

import staff.Teacher;

public class EnglishCourse extends Course {
  public EnglishCourse(Teacher courseTeacher, int availableSeats) {
    super("English course for students", "English course", courseTeacher, availableSeats);
  }
}
