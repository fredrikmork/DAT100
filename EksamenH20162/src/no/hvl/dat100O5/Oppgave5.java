package no.hvl.dat100O5;

import org.omg.Messaging.SyncScopeHelper;

public class Oppgave5 {

  static boolean[][] ikon = { { false, false, true, false, false }, { false, false, false, true, false },
      { true, true, true, true, true }, { false, false, false, true, false }, { false, false, true, false, false }, };

  // a)
  public boolean erSvart(int r, int k) {
    return ikon[r][k];
  }

  // b)
  public void vis() {

    for (int r = 0; r < 5; r++) {
      for (int k = 0; k < 5; k++) {
        if (ikon[r][k]) {
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }

  // c)
  public boolean flestSvarte() {
    int hvit = 0;
    int svart = 0;
    boolean isTrue = false;

    for (int r = 0; r < 5; r++) {
      for (int k = 0; k < 5; k++) {
        if (ikon[r][k]) {
          hvit += 1;
        } else {
          svart += 1;
        }

      }
      if (hvit < svart) {
        isTrue = true;
      }
    }
    return isTrue;
  }

  // d)
  public boolean[][] inverter() {
    boolean[][] nyTabell = new boolean[ikon.length][ikon.length];
    for (int r = 0; r < ikon.length; r++) {
      for (int k = 0; k < ikon[r].length; k++) {
        nyTabell[r][k] = !ikon[r][k];
        System.out.print(nyTabell[r][k] + "  ");
      }
      System.out.println();

    }
    return nyTabell;
  }
  //e)
  public boolean [][] speilVend(){
    boolean [][] mirrorTabell = new boolean [ikon.length][ikon.length];
    for (int r = 0; r < ikon.length; r++) {
      for (int k = 0; k < ikon[r].length; k++) {
        mirrorTabell[r][k] = ikon[r][ikon.length - 1 - k];
        if(mirrorTabell[r][k]) {
          System.out.print("#");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
    return mirrorTabell;
  }
  
  
}
