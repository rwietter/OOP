package com.inheritance;

/**
 * @author Mauricio
 */
public class Student extends Person {
  private int register;
  private String course;
  private double payMonthly;

  public void payMonthly(double monthly){
    this.setPayMonthly(monthly);
  }

  public int getRegister() {
    return register;
  }

  public void setRegister(int register) {
    this.register = register;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public double getPayMonthly() {
    return payMonthly;
  }

  public void setPayMonthly(double payMonthly) {
    this.payMonthly = payMonthly;
  }
}
