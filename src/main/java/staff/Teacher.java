package staff;

import java.util.ArrayList;
import java.util.List;
import shared.Skills;

public class Teacher {
  public String name;
  public int id;
  private double salary;
  private List<Skills> skills = new ArrayList<>();

  public Teacher(String name, int id, double salary, List<Skills> skills) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.skills = skills;
  }

  public double getSalary() {
    return this.salary;
  }

  public List<Skills> getSkills() {
    return this.skills;
  }
}
