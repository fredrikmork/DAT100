package no.hvl.dat100;

/*
 *  Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn
 *  og skriv ut den karakteren A-F dette tilsvarer.
 */
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg6poengSum {
  public static void main(String[] args) {
    int maxStudents = 10;
    String tallTxt = "Skriv inn poengsummen din";
    int sum;
   
    do {
      sum = parseInt(showInputDialog(tallTxt));
      maxStudents -=1;
      if (sum > 100) {
        showMessageDialog(null, "Ugyldig nummer, tast inn poengsummen din på nytt");
      } else if (sum > 90) { 
        showMessageDialog(null, "Du fikk karakter A");
      } else if (sum > 80) { 
        showMessageDialog(null, "Du fikk karakter B");
      } else if (sum > 60) {
        showMessageDialog(null, "Du fikk karakter C");
      } else if (sum > 50) {
        showMessageDialog(null, "Du fikk karakter D");
      } else if (sum > 40) {
        showMessageDialog(null, "Du fikk karakter E");
      } else if (sum > 0) {
        showMessageDialog(null, "Du fikk karakter F");
      } else {
        showMessageDialog(null, "Ugyldig nummer, tast inn poengsummen din på nytt");
      }
    } while (!(sum >= 0 && sum <= 100) || maxStudents > 0); 
      
  }
}
