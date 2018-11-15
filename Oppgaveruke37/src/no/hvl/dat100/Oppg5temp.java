package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg5temp {
  /*
   * Du skal lage et program for å lese inn temperaturen i 
   * Bergen for et bestemt klokkeslett for alle dager i en bestemt uke 
   * (dvs. 7 temperaturer). 
   * Programmet skal videre finne og skrive ut gjennomsnittet 
   * av disse verdiene og den høyeste temperaturen for hele uken.
   */
  public static void main(String[] args) {
    String txt;
    String [] ukedag = {"mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag", "søndag"};
    boolean høyeste = false;
    int i = 0;
    double input;
    int sum =0;
    double gjennomsnitt;
    double [] tall = new double [7];
    int hV = 0;
    for (i=0; i<ukedag.length; i++) {
      txt = "Skriv inn temperaturen kl. 14:00 på " + ukedag[i];
      tall[i] = parseInt(showInputDialog(null, txt));
      sum += tall[i];
      System.out.println(ukedag[i]+ ": "+tall[i]);
      
    }
    int j;
    for(j=1; j<7; j++) {
      if(tall[hV]<tall[j]) {
        hV=j;
      }
        
    }
    gjennomsnitt = sum/ukedag.length;   
    System.out.println("Gjennomsnittet denne uken var "+gjennomsnitt+" grader");
    System.out.println("Høyeste temperaturen var: "+tall[hV]+" og var på "+ukedag[hV]);
  }

}
