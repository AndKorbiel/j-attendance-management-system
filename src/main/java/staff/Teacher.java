package staff;

import java.util.ArrayList;
import java.util.List;
import shared.Skills;

public class Teacher {
  public String name;
  private double hoursPerWeek;
  public int id;
  private double salary;
  private List<Skills> skills = new ArrayList<>();
  private static int teachersCount = 0;

  public Teacher(String name, double salary, List<Skills> skills) {
    this.name = name;
    this.salary = salary;
    this.skills = skills;
    teachersCount++;
    this.id = teachersCount;
  }

  public double getSalary() {
    return this.salary;
  }

  public List<Skills> getSkills() {
    return this.skills;
  }

  public Double countMonthlySalary() {
    return hoursPerWeek * 4 * salary;
  }
}
