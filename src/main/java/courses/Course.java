package courses;

public class Course {
  private String description;
  private Double hoursPerWeek;
  private String name;
  private String teacherName;
  public CourseParticipants courseParticipatns;

  public Course(
      String description,
      String name,
      String teacherName,
      int availableSeats) {
    this.description = description;
    this.name = name;
    this.teacherName = teacherName;
    this.courseParticipatns = new CourseParticipants(availableSeats);
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

  public Double getHoursePerWeek() {
    return this.hoursPerWeek;
  }
}
