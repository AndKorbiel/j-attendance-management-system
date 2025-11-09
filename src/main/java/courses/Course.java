package courses;

import staff.Teacher;

public class Course {
  private String description;
  private Double hoursPerWeek;
  private String name;
  public CourseParticipants courseParticipatns;
  public Teacher courseTeacher;

  public Course(
      String description,
      String name,
      Teacher courseTeacher,
      int availableSeats) {
    this.description = description;
    this.name = name;
    this.courseParticipatns = new CourseParticipants(availableSeats);
    this.courseTeacher = courseTeacher;
  }

  public String getDescription() {
    return this.description;
  }

  public String getName() {
    return this.name;
  }

  public Double getHoursePerWeek() {
    return this.hoursPerWeek;
  }
}
