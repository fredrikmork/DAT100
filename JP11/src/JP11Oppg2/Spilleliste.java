package JP11Oppg2;

import java.util.ArrayList;

import JP11Oppg2.Sang.Sjanger;

public class Spilleliste {
  
  private ArrayList<Sang> sanger;
  public Spilleliste() {
    sanger = new ArrayList<Sang> ();
  }
  public void leggTil(Sang sang) {
    sanger.add(sang);
  }
  
  public boolean leggTilSjekk(Sang sang) {
    if(sanger.contains(sang)) {
      return false;
    } else {
      leggTil(sang);
      return true;
    }
  }

  public void visListe() {
    for(int i=0; i < sanger.size(); i++) {
      sanger.get(i).skrivUt();
    }
  }
  public ArrayList<Sang> finnSanger(Sjanger sjanger){
    ArrayList <Sang> temp = new ArrayList<Sang>();
    for(int i=0; i<sanger.size(); i++) {
      if(sanger.get(i).getGenre() == sjanger) {
        temp.add(sanger.get(i));
      } 
    }
    return temp;
  }
}
