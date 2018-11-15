package no.hvl.dat100O3;
/*
public abstract class Kunde {
  private String brukernavn;
  private String passord;
  private int kundenummer;
  
  public Kunde(String brukernavn, String passord, int kundenummer) {
    this.brukernavn = brukernavn;
    this.passord = passord;
    this.kundenummer = kundenummer;
  }
  public abstract double betal(double belop);
  

public class Privatkunde extends Kunde {
  
  private int avslag;
  private float grense;
  private float total;
  
  public Privatkunde(String brukernavn, 
      String passord, int kundenummer, int avslag, 
      float grense, float total) {
    super(brukernavn, passord, kundenummer);
    this.avslag = avslag;
    this.grense = grense;
    this.total = total;
  }
  public double betal(double belop) {
    if(total > grense) {
      double over;
      double under;
      if ( belop > grense) {
        // avslag skal gis 
        under = grense;
        over = belop - grense * (1 - avslag/100);
        belop = over + under;
      }   
      
    }
    total += belop;
  }
}
public class Bedriftskunde extends Kunde {
  
  private int rabatt;
  
  public Bedriftskunde(String brukernavn, 
      String passord, int kundenummer, int rabatt) {
    super(brukernavn, passord, kundenummer);
    this.rabatt = rabatt;

  }
  public double betal(double belop) {
    return belop * (1-rabatt/100);
  }
  public Bedriftskunde tilBedriftsKunde(PrivatKunde pkunde) {
    BedriftsKunde nyBKunde = new BedriftsKunde(pkunde.getBrukernavn(), 
        pkunde.getPassord(), pkunde.getKundenummer(), 5);
    return nyBKunde;
  }
}*/
