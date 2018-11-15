package no.hvl.dat100O4;

public class Varesamling {
  private Vare [] samling;
  private int antall;
  
  public Varesamling(int stryk) {
    this.samling = new Vare[stryk];
    antall = 0;
  }
  public void leggTil(Vare v) {
     if(antall < samling.length) {
       samling[antall] = v;
       antall++;
     } else {
       System.out.println("la la la Espiranza, da da da da, Stryk meg!");
     }
    
  }

  public Vare finnVare(int nummer) {
    boolean funnet = false;
    int pos = 0;
    //Leter gjennom tabellen og gir pos indekstallet til varen.
    while(!funnet && pos < antall) {
      if(nummer == samling[pos].getNummer()) {
        funnet = true;
      } else {
        pos++;
      }
    }
    //Bruker indeksen og sjekker om den er lik og over null og returnerer søket.
    if(pos >= 0 && pos < antall) {
      return samling[pos];
    } else {
      return null;
    }
  }

}
