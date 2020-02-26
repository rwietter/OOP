package com.movie;

/**
 * @author Mauricio
 */
public abstract class Person {
  protected String name;
  protected int age;
  protected String sex;
  protected int experience;

  public Person(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public void newExperience(){

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

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    return "Person = {" +
        "\n name: '" + name + '\'' +
        ",\n age: " + age + ",\n" +
        " sex: '" + sex + '\'' + "," +
        "\n experience: " + experience + ",";
  }
}
