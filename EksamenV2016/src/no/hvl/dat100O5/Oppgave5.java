package no.hvl.dat100O5;

public class Oppgave5 {
  boolean[][] tilgjengelig = { { true, true, false },
      { true, false, true },
      { true, true, true },
      { false, true, false } };
  
  public boolean kan (int p, int t) {
    boolean kan = false;
    if(tilgjengelig[p][t]) {
      kan = true;
    }
    return kan;
  }
  
  public void skrivUt() {
    for(int r = 0; r <tilgjengelig.length; r++) {
      for(int k = 0; k < tilgjengelig[r].length; k++) {
        if(kan( r, k)) {
          System.out.print("+ ");
        } else {
          System.out.println("- ");
        }
      }
      System.out.println();
    }
  }
  
  public boolean kanAlle(int t) {
    int antall = 0;
    boolean alleKan = false;
    for(int p = 0; p < tilgjengelig.length; p++) {
      if(tilgjengelig[p][t]) {
        antall++;
      }
      if(tilgjengelig[0].length == antall) {
        alleKan = true;
      }
    }
    return alleKan;
  }
  
  public int foeslaaTidspunkt() {
    int antall1 = 0;
    int antall2 = 0;
    int antall3 = 0;
    int temp = 0;
    for (int t = 0; t < tilgjengelig[0].length; t++) {
      for(int p = 0; p < tilgjengelig.length; p++) {
        
        switch(t) {
        case 0: antall1++;
          break;
        case 1: antall2++;
          break;
        case 2: antall3++;
          break;
        }  
      }
    }
    temp = Math.max(Math.max(antall3, antall1), antall2);
   return temp; 
  }
}
