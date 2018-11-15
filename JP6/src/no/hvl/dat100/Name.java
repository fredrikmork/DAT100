package no.hvl.dat100;

public class Name {
  //ObjectVariables
  private String firstname;
  private String surname;
  //StandardConstructor
  public Name() {
    firstname = "";
    surname = "";
  }
  //Constructor
  public Name(String fN, String sN) {
    firstname = toLowerCaseAndUpperCase(fN);
    surname = toLowerCaseAndUpperCase(sN);
  }
  //ObjectMethod
  public String toLowerCaseAndUpperCase(String input) {
      return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
  }
  //Getters & Setters
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  //toString-method
  @Override
  public String toString() {
    String print = surname + ", " + firstname;
    return print;
  }
}