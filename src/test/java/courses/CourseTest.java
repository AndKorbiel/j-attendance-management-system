package courses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import students.Student;

public class CourseTest {
  // given
  String description = "Test decription";
  String name = "Test name";
  String teacherName = "John Doe";
  int availableSeats = 10;

  private final Course testCourse = new Course(description, name, teacherName, 10);
  private final Student studentA = new Student("John");
  private final Student studentB = new Student("Peter");

  @Test
  public void testCourseConstructor() {
    assertEquals(name, testCourse.getName());
    assertEquals(description, testCourse.getDescription());
    assertEquals(teacherName, testCourse.getTeacherName());
    assertEquals(10, testCourse.getAvailableSeats());
  }

  @Test
  public void testEnrollStudents() {
    // given
    final Map<Integer, Student> enrolledStudents = new HashMap<>();

    // when
    assertEquals(10, testCourse.getAvailableSeats());
    assertTrue(testCourse.getEnrolledStudentsList().isEmpty());

    testCourse.enrollStudent(studentA);
    enrolledStudents.put(studentA.getId(), studentA);

    // then
    assertEquals(9, testCourse.getAvailableSeats());
    assertTrue(testCourse.getEnrolledStudentsList().equals(enrolledStudents));

    // when
    testCourse.enrollStudent(studentB);
    enrolledStudents.put(studentB.getId(), studentB);

    // then
    assertEquals(8, testCourse.getAvailableSeats());
    assertTrue(testCourse.getEnrolledStudentsList().equals(enrolledStudents));
  }

  @Test
  public void testRemoveEnrolledStudents() {
    // given
    final Map<Integer, Student> enrolledStudents = new HashMap<>();

    testCourse.enrollStudent(studentA);
    testCourse.enrollStudent(studentB);
    enrolledStudents.put(studentA.getId(), studentA);
    enrolledStudents.put(studentB.getId(), studentB);

    assertEquals(8, testCourse.getAvailableSeats());
    assertTrue(testCourse.getEnrolledStudentsList().equals(enrolledStudents));

    // when
    testCourse.removeStudent(studentA);
    enrolledStudents.remove(studentA.getId());

    // then
    assertEquals(9, testCourse.getAvailableSeats());
    assertTrue(testCourse.getEnrolledStudentsList().equals(enrolledStudents));
  }

  @Test
  public void testWaitingStudentsList() {
    // given
    final Course testCourseWithTwoSeats = new Course(description, name, teacherName, 2);

    testCourseWithTwoSeats.enrollStudent(studentA);
    testCourseWithTwoSeats.enrollStudent(studentB);

    assertEquals(0, testCourseWithTwoSeats.getAvailableSeats());
    assertEquals(2, testCourseWithTwoSeats.getEnrolledStudentsList().size());
    assertEquals(true, testCourseWithTwoSeats.checkIfCourseIsFull());
  }
}
