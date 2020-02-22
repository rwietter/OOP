package com.person;

/**
 * @author Mauricio
 */
public class Student extends Person{

  private int registration;
  private String course;


  public void cancelRegistration(){
    this.setRegistration(0);
    System.out.println("Canceled registration!");
  }

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
}
