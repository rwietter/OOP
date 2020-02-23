package com.inheritance;

/**
 * @author Mauricio
 */
public abstract class Person {
  private String name;
  private int age;
  private String sex;

  final public void  makeBirthday(){
    this.setAge(this.getAge() + 1);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Data: " + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'';
  }
}
