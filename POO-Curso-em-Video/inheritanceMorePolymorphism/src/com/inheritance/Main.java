package com.inheritance;

/**
 * @author Mauricio
 * Herança de diferenças
 */
public class Main {

    public static void main(String[] args) {
      /*
       * Person person = new Person();
       * Person not should generator a instance of object
       */

      // visitor inherits super-class methods
      Visitant visitant = new Visitant();
      visitant.setName("Carol Danvers");
      System.out.println(visitant.toString());

      Student student = new Student();
      student.setName("Carol");
      student.setCourse("Aerospace Engineering");
      student.setPayMonthly(6.000);
      System.out.println(student.toString());

      Scholarship scholarship = new Scholarship();
      scholarship.setName("Danvers");
      scholarship.setAge(17);
      scholarship.setSex("F");
      scholarship.payMonthly();
      System.out.println(scholarship.toString());
    }
}
