package no.hvl.dat100O4;

public class Test {
  
  public static void main(String[]args) {
    
    Pasient pasient1 = new Pasient ("Kari Hanson", "01019112345", 0);
    
    Venteliste vl = new Venteliste(10);
    
    vl.leggTil(pasient1);
    
    vl.oppdaterDager(10);
    
    Pasient pasient2 = new Pasient ("Ola Hanson", "01219112445", 0);
    
    vl.leggTil(pasient2);
    
    //vl.skrivUt();
  }
}
