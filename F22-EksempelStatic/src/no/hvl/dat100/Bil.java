package no.hvl.dat100;

public class Bil {
  private static int nesteNummer = 1;
  
  private int id;
  private String regNr;
   
  public Bil (String regNr) {
    id = nesteNummer;
    nesteNummer++;
    this.regNr = regNr;
  }
  @Override
  public String toString() {
    return "ID: " + id + ", Registreringsnummer: " + regNr + ", Nestenummer: " + nesteNummer;
  }
  public static void tullEn() {
    // Ikke lov å kalle objektmetode fra statisk metode
    //  tullTo();
  }
  public void tullTo() {
    //lov
    tullEn();
  }
  public static int nesteNr() {
    tullEn();
    return nesteNummer;
  }
}
