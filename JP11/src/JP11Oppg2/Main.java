package JP11Oppg2;

import JP11Oppg2.Sang.Sjanger;

public class Main {

  public static void main(String[] args) {
    Spilleliste s1 = new Spilleliste();
    Sang s = new Sang("Hei", 12, Sjanger.POP);
    s1.leggTil(s);
    s1.visListe();
  }

}