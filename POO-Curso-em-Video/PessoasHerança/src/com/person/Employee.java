package com.person;

/**
 * @author Mauricio
 */
public class Employee extends Person{
  private String department;
  private boolean working;

  public void changeWork(String setNewWork){
    this.setDepartment(setNewWork);
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public boolean isWorking() {
    return working;
  }

  public void setWorking(boolean working) {
    this.working = working;
  }
}
