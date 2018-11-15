package no.hvl.dat100;

public class Varelager {
  // Objektvariabler
  private final static int KAPASITET = 10;
  private int antall;
  private Vare[] varelager;
  // Standard-Konstruktør
  public Varelager() {
    this(KAPASITET); //kaller konstruktøren under med kapasitet = 10
  }
  // Konstruktør
  public Varelager(int kapasitet) {
    antall = 0;
    varelager = new Vare[kapasitet];
  }
  // Objektmetoder
  // ---------------- Legge til
  public void leggTil(Vare v) {
    if (antall == varelager.length)
      utvid();
    varelager[antall] = v;
    antall++;
  }
  // ---------------- Søk vare
  public Vare sokVare(int nr) {
    int indeks = finn(nr);
    if(indeks == -1)
      return null;
    else
      return varelager[indeks];
  }
  // ---------------- Total pris
  public double totalPris() {
    double totalPris = 0.0;
    for (Vare v:varelager) {
      if( v != null) {
        totalPris += v.getPris();
      }
    }
    return totalPris;
  }
  
  // ---------------- Slett (Fjerner og returnerer student hvis fins ellers null)
  public Vare slett(int vareNr) {
    Vare v = null;
    int indeks = finn(vareNr);
    if(indeks != -1) {
      v = varelager[indeks];
      varelager[indeks] = varelager[antall - 1];
      antall--;
    }
    return v;
  }
  // ---------------- Utvid varelager
  private void utvid() {
    Vare[] hjelpevarelager = new Vare[varelager.length * 2];
    for (int i = 0; i < varelager.length; i++) {
      hjelpevarelager[i] = varelager[i];
    }
    varelager = hjelpevarelager;
  }
  // ---------------- Finn indeks
  private int finn(int nr) {
    int i = 0;
    int resultat = -1;
    boolean funnet = false;
    if(!erTom()) {
      while (!funnet && i < antall) {
        if(nr == (varelager[i].getVareNr()))
          funnet = true;
        else
          i++;
      }
      if(funnet) {
        resultat = i;
      }
    }
    return resultat;
  }
  // ---------------- Avgjør om varelageren er tom
  public boolean erTom() {
    return (antall == 0);
  }
  // Getters & Setters
  public double getAntall() {
    return antall;
  }
  public Vare[] varelager() {
    return varelager;
  }
  public void setAntall(int antall) {
    this.antall = antall;
  }
  //toString
  public String toStringPris() {
    return "Samlet pris for varene er:" + totalPris();
  }
  @Override
  public String toString() {
    String print = "";
    for(Vare v:varelager) {
      if(v != null)
        print = print + v.toString();
    }
    
    return print;
  }
  
}//Class