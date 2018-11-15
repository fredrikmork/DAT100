package no.hvl.dat100O2;

public class Innboks implements IInnboks {
  
  private Epost [] epost;
  
  public Innboks (int antall) {
    this.epost = new Epost[antall];
  }
  
  public int maxAntall() {
    return epost.length;
  }
  
  public int antallLedige() {
    int antall = 0;
    for(int i = 0; i< epost.length; i++) {
      if(epost[i] == null) {
        antall = epost.length - i;
      }
      
    }
    return antall;
  }
  
  public boolean erFull() {
    return true;
  }
  
  public boolean leggTil(Epost epost) {
    return true;
  }

  public Epost[] getEpost() {
    return epost;
  }

  public void setEpost(Epost[] epost) {
    this.epost = epost;
  }
  
}
