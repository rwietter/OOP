package com.person;

/**
 * @author Mauricio
 */
public class Teacher extends Person {

  private String specialty;
  private float pay;

  public void receiveIncrease(float pushPay){
    this.setPay(this.getPay() + pushPay);
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public float getPay() {
    return pay;
  }

  public void setPay(float pay) {
    this.pay = pay;
  }
}
