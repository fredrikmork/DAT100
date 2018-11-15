package no.hvl.dat100;
//o Ekstra objektvariabler
// studentnummer (int)
// klasse (String)
//o Standard konstruktør
//o Konstruktør med fem parametre
//o toString() som returnerer data i objektet som en streng, eks:
//"STUDENT\n10100110700\nOlsen\nOle\n100\n1A\n"
public class Student extends Person {
  private int studentNumber;
  private String class1;
  //Standard-constructor
  public Student() {
    studentNumber = 0;
    class1 = "";
  }
  //Constructor
  public Student(long nI, String sN, String fN, int sn, String c1) {
    studentNumber = sn;
    class1 = c1;
  }
  //ObjectMethods
  //Getters&Setters
  public int getStudentNumber() {
    return studentNumber;
  }
  public void setStudentNumber( int sn) {
    studentNumber = sn;
  }
  public String getClass1() {
    return class1;
  }
  public void setClass1(String c1) {
    class1 = c1;
  }
  //toString
  public String toString() {
    String print = "STUDENT\n"  ;
    print += super.toString() + "\n";
    print += studentNumber + "\n" + class1 + "\n";
    return print;
  }
}
