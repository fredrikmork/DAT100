package no.hvl.dat100;

public class Student extends Person {
  //Objectvariables
  private int studentNumber;
  private String class1;
  //Constructor
  public Student(String sN, String fN, int bY, char sx, int sn, String c1) {
    studentNumber = sn;
    class1 = c1;
  }
  //Objectmethods
  //Get & Set
  public int getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }
  //toString
  @Override
  public String toString() {
    String print = "Name: " ;
    return print;
  }
}
