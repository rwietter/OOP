package com.person;

/**
 * @author Mauricio
 */
public class Main {

    public static void main(String[] args) {

      Person person = new Person();
      Student student = new Student();
      Teacher teacher = new Teacher();
      Employee employee = new Employee();

      student.setName("Maria");
      teacher.setName("Jay");
      employee.setName("Martin");
      student.setAge(18);
      student.setSex("F");

      student.setCourse("Software Engineer");
      teacher.setPay(13000);
      employee.setWorking(true);

      System.out.println(      person.toString());
      System.out.println(      student.toString());
      System.out.println(      teacher.toString());
      System.out.println(      employee.toString());
    }
}
