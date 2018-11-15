package no.hvl.dat100;
//Ekstra objektvariable
// månadsløn (int)
// kontonummer (int)
//o Standard konstruktør
//o Konstruktør med fem parametre
//o toString() som returnerer data i objektet som en streng, eks:
//"LAERER\n10100110700\nOlsen\nOle\n1000\n7676\n"
public class Teacher extends Person {
  //Objectvariables
  private int monthSalary;
  private int accountNumber;
  //Standard-constructor
  public Teacher() {
    monthSalary = 0;
    accountNumber = 0;
  }
  //Constructor
 public Teacher(long nI, String sN, String fN, int mS, int aN) {
    monthSalary = mS;
    accountNumber = aN;
  }
  //Objectmethods
  //Getters&Setters
 public int getMonthSalary() {
   return monthSalary;
 }
 public void setMonthSalary(int mS) {
   monthSalary = mS;
 }
 public int getAccountNumber() {
   return accountNumber;
 }
 public void setAccountNumber(int aN) {
   accountNumber = aN;
 }
  //toString
 public String toString() {
   String print = "TEACHER\n"  ;
   print += super.toString() + "\n";
   print += monthSalary + "\n" + accountNumber + "\n";
   return print;
 }
}
