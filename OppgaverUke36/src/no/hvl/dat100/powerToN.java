package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
/*
 * For å regne ut verdien x
n
, der n er et positivt heltall og x har en reell (double) verdi, kan du bruke funksjonen
Math.pow(x,n) i Math-klassen. 
 */
public class powerToN {
  public static void main(String[]args) {
    String iTxt = "Skriv inn verdi av X";
    String aTxt = "Skriv inn verdi av n, der n er et positivt heltall";
    
   double x = parseInt(showInputDialog(null,iTxt));
   int n = parseInt(showInputDialog(null,aTxt));
   double result = x;
   int i = n;
   
   while(i>1) {
     result *=x;
     i--;
   }
   
   showMessageDialog(null, x+"opphøyet i "+n+"er: " + result);
  }
}
