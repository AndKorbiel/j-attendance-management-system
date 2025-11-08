package courses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import students.Student;

public class Course {
  private int availableSeats;
  private String description;
  private Map<Integer, Student> enrolledStudents = new HashMap<>();
  private boolean isCourseFull = this.availableSeats < enrolledStudents.size();
  private String name;
  private String teacherName;
  private List<Student> waitingStudentsList = new LinkedList<>();

  public Course(
      String description,
      String name,
      String teacherName,
      int availableSeats) {
    this.description = description;
    this.name = name;
    this.teacherName = teacherName;
    this.availableSeats = availableSeats;
  }

  public String getDescription() {
    return this.description;
  }

  public String getName() {
    return this.name;
  }

  public String getTeacherName() {
    return this.teacherName;
  }

  public int getAvailableSeats() {
    return this.availableSeats;
  }

  public Map<Integer, Student> getEnrolledStudentsList() {
    return this.enrolledStudents;
  }

  public boolean checkIfCourseIsFull() {
    return this.isCourseFull;
  }

  public void enrollStudent(Student newStudent) {
    if (!this.isCourseFull) {
      int studentId = newStudent.getId();

      this.enrolledStudents.put(studentId, newStudent);
    } else {
      this.waitingStudentsList.add(newStudent);
    }
  }

  public void removeStudent(Student currentStudent) {
    int studentId = currentStudent.getId();

    this.enrolledStudents.remove(studentId);
  }
}
