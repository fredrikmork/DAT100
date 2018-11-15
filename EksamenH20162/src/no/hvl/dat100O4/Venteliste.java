package no.hvl.dat100O4;

public class Venteliste {
  private Pasient [] samling;
  private int antall;
  
  public Venteliste (int dager) {
    this.samling = new Pasient[antall];
    this.antall = 0;
  }
  public void oppdaterDager(int dager) {
    for(int i = 0; i < antall; i++) { //går gjennom alle som er i samling tabellen
      int dag = samling[i].getDager(); //for hver indeksøkning skal dag være den indekserte antall dager;
      samling[i].setDager(dag + dager); //øker tallet på dager som de har ventet på, med heltallet som er gitt ved dager
    }
  }
  public boolean leggTil(Pasient pasient) {
    boolean like = false;
    boolean sattInn = false;
    int i = 0;
    while(i < antall && !like) {
      if(samling[i].getFodselsnummer().equals(pasient.getFodselsnummer())) {
        like = true;
      } else {
        i++;
      }
      if(!like && antall < samling.length) {
        samling[antall] = pasient;
        antall++;
        sattInn = true;
      }
    }
    return sattInn;
  }
  public Pasient ventetLengst() {
    Pasient pasient = null;
    if(antall > 0) {
      pasient = samling[0];
    }
    for (int i = 0; i < antall; i++) {
      Pasient nestePasient = samling[i];
      if(pasient.getDager() < nestePasient.getDager()) {
        pasient = nestePasient;
      }
    }
    return pasient;
  }
  
  public void skrivUt(Pasient pasient) {
    for(int i = 0; i < antall; i++) {
      System.out.println(samling[i]);
    }
    
  }
}
