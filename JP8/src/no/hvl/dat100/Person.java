package no.hvl.dat100;

public class Person {
  //Objectvariables
  private String surname;
  private String firstname;
  private int birthYear;
  private char sex;
  //Standard Constructor
  public Person() {
    surname = "";
    firstname = "";
    birthYear = 0;
  }
  //Constructor
  public Person(String sN, String fN, int bY, char sx) {
    surname = sN;
    firstname = fN;
    birthYear = bY;
    sex = sx;
  }
  //Methods
  //Get & Set
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }
  public char getSex() {
    return sex;
  }
  public void setSex(char sex) {
    this.sex = sex;
  }
  //Objectmethods
  @Override
  public String toString() {
    String print = "Name: " + firstname + " " + surname + "Birthyear: " + birthYear + "Sex: " + sex + "\n";
    return print;
  }
}
