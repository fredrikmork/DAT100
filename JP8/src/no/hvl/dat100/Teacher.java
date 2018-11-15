package no.hvl.dat100;

public class Teacher extends Person {
  //Objectvariables
  private int monthSalary;
  private int accountNumber;
  //Constructor
  public Teacher(String sN, String fN, int bY, char sx, int mS, int aN) {
    super(sN, fN, bY, sx);
    monthSalary = mS;
    accountNumber = aN;
  }
  //Objectmethods
  //Get & Set
  public int getMonthSalary() {
    return monthSalary;
  }
  public void setMonthSalary(int monthSalary) {
    this.monthSalary = monthSalary;
  }
  public int getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
  //toString
  @Override
  public String toString() {
    String print = super.toString();
    print = "Month salary: " + monthSalary + "\n";
    print += "";
    return print;
  }
  
}
