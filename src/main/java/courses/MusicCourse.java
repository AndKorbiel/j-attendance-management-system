package courses;

import staff.Teacher;

public class MusicCourse extends Course {
  public MusicCourse(Teacher courseTeacher, int availableSeats) {
    super("Music course for students", "Music course", courseTeacher, availableSeats);
  }
}
