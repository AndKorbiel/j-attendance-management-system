package courses;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CourseTest {
  // given
  String description = "Test decription";
  String name = "Test name";
  String teacherName = "John Doe";
  int availableSeats = 10;

  private final Course testCourse = new Course(description, name, teacherName, 10);

  @Test
  public void testCourseConstructor() {
    assertEquals(name, testCourse.getName());
    assertEquals(description, testCourse.getDescription());
    assertEquals(teacherName, testCourse.getTeacherName());
    assertEquals(10, testCourse.courseParticipatns.getAvailableSeats());
  }
}
