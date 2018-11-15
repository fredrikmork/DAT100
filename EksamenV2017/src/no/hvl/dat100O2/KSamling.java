package no.hvl.dat100O2;

public class KSamling {
  private Kommune [] kTab;
  private int antall;
  
  public KSamling (int storrelse) {
    this.antall = 0;
    this.kTab = new Kommune[storrelse];
  }
  
  public boolean leggTil (Kommune k) {
    boolean lagtTil = false;
    
    if( kTab.length >= antall) {
      kTab[antall] = k;
      lagtTil = true;
    }
    
    return lagtTil;
  }
  
  public Kommune tettestBefolket() {
    Kommune k = null;
    
    for(int i = 0; i < antall; i++) {
      k = kTab[0];
      if(k == null) {
        return null;
      } else if( kTab[i].tetthet() > k.tetthet()) {
        k = kTab[i];
      }
    }
    
   return k;
   
  }
}
