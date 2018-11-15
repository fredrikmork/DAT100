package no.hvl.dat100;
import static java.lang.System.*;

public class Account {
  //Objectvariables
  
  private static int accountNumber;
  private double balance;
  
  //Constructors
  public Account() {
    accountNumber = 0;
    balance = 0;
  }
  public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  
  //ObjectMethods
  
  
  public void deposit (double amount) {
    balance = balance + amount;
  }
  public void withdraw (double amount) {
    if(amount <= balance) {
      balance = balance - amount;
    }else {
     err.println("Error, type in an amount lower than the balance.");
    }
  }
  
  //return accountNumber
  public int accountNumber () {
    accountNumber++;
    return accountNumber;
  }
  
  //return balance
  public double getBalance () {
    return balance;
  }
}
