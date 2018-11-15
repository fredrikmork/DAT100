package no.hvl.dat100;
import static java.lang.System.*;
/* 
 * ---Account---
 * Lag en klasse Account med objektvariabler accountNumber og balance.
 * Klassen skal ha kontruktør for initiering av objektvariablene, samt 
 * metoder for å avlese saldo, og for å sette inn og ta ut penger fra
 * kontoen
 * 
 * ---ClientAccount----
 * La et testprogram opprette tre account-objekt, prøve ut objektmetodene
 * og skrive ut samlet saldo for kontoene.
 * 
 */
public class ClientAccount {
  public static void main(String[]args) {
    //creates new accounts
    Account fredda = new Account();
    Account simen = new Account();
    Account sondre = new Account();
    
    fredda.deposit(10000);
    simen.deposit(50);
    sondre.withdraw(1);
    
    out.println("Fredda: "+ fredda.accountNumber() + "\nSaldo: " + fredda.getBalance() + "\n");
    out.println("Simen: " + simen.accountNumber() + "\nSaldo: " + simen.getBalance() + "\n");
    out.println("Sondre: "  + sondre.accountNumber() + "\nSaldo: " + sondre.getBalance() + "\n");
  }

}
