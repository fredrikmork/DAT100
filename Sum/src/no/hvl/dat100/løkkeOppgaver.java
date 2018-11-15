package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.util.Scanner;

public class løkkeOppgaver {
  public static void main (String[]args) {
    int sum1 = 0;
    int sum2 = 0;
    boolean gyldigInndata;
    String tallTxt="";
    String feilmelding = "Feil inndata. Tallet er ikke et tall mellom 2 og 20.";
    String melding = "Tast inn n (et tall mellom 2 og 20): ";
    int n = 0;
    
    do {
      tallTxt = showInputDialog(null, melding);
      n = parseInt(tallTxt);
      gyldigInndata = (n>=2) && (n<=20);
      if(!gyldigInndata) {
        showMessageDialog(null, feilmelding);
      }
    }while (!gyldigInndata);
    
    int teller = 1;
    while (teller < n) {
      sum1 = sum1 + teller;
      System.out.print(teller + " + ");
      teller = teller + 1;
    }
    System.out.println(n + " = " + (sum1 + n));
  }
}
