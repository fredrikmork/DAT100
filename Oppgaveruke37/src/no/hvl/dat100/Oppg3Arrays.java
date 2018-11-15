package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg3Arrays {
  public static void main(String[] args) {
    /*
     * a) Lag en klasse med en main-metode som leser antall ord og oppretter en strengtabell (String-array) 
     *    med den gitte størrelsen. Les deretter ordene fra brukeren og plasser dem i tabellen. 
     *    Skriv ut tabellen for å se at ordene er kommet inn.
     *
     *
     * b) Utvid main-metoden så den leser inn et mønster (streng) fra tastatur (terminal). 
     *    Tell hvor mange ord i tabellen fra pkt. b) som inneholder mønsteret og skriv ut svaret.
     *
     *
     * c) Gå gjennom tabellen og skriv ut de midterste tegnene i hver streng der du bruker følgende regler.
     *    Dersom strengen inneholder bare ett tegn, skrives hele strengen ut. 
     *    Dersom lengden er partall, skal de to midterste tegnene skrives ut. 
     *    Dersom strengen har odde lengde (odde antall tegn), 
     *    skal de 3 midterste tegnene skrives ut om strengen inneholder 3 tegn eller mer.
     */
    String txt = "Skriv inn antall ord";
    String txt1 = "Skriv inn et ord";
    String txt2 = "Ord som skal letes etter";
    
    int antOrd = parseInt(showInputDialog(null, txt));
    int teller = 0;
   
    boolean funnet = false;
    String [] stringTab = new String [antOrd]; //oppretter en array med antall ord(antOrd) som bruker leser inn
    int i=0;
    
    for(i=0; i<antOrd; i++ ) {
      stringTab[i]=showInputDialog(txt1);
      System.out.println(stringTab[i]);
    }
    String leteEtter =showInputDialog(txt2);
    for(int n=0; n<antOrd; n++) {
      funnet = stringTab[n].contains(leteEtter);
      if (funnet) {
        teller++;
      }
    }
    System.out.println("Funnet: " + leteEtter+"\n Antall forekomster: " + teller);
    //oppgave c
    int posisjon;
    
    if(leteEtter.length()% 2 == 0) {
      posisjon = leteEtter.length() / 2;
      System.out.println(leteEtter.substring(posisjon-1,posisjon+1));
    } else {
      posisjon = leteEtter.length() /2;
      System.out.println(leteEtter.substring(posisjon - 1, posisjon));
    } 
    
    //char result = txt1.charAt();
    //System.out.println(result);
    
  }
    
}
