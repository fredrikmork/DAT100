package no.hvl.dat100O5;

import java.util.ArrayList;

public class Graf {
  private boolean[][] nabomatrise = {
      { false, true, false, true, false, false },
      { true, false, true, false, true, true },
      { false, true, false, false, true, true },
      { true, false, false, false, false, false },
      { false, true, true, false, false, true },
      { false, true, true, false, true, false } };
  
      public boolean erNaboer(int u, int w) {
        return nabomatrise[u][w];
      }
      
      public boolean erSti(int[] noder) {
        boolean erSti = true;
        int i = 0;
        while(erSti && i < noder.length - 1) {
          if(!erNaboer(i, i-1)) {
            erSti = false;
          }
        }
        return erSti;
      }
      
      public ArrayList<Integer> naboer(int v) {
        ArrayList<Integer> strykMeg = new ArrayList<Integer>();
        for(int k = 0; k < nabomatrise[v].length; k++) {
          if(nabomatrise[v][k]) {
            strykMeg.add(k);
          }
        }
        return strykMeg;
      }
      
      public boolean harLokke() {
        
        int i = 0;
        for (i = 0; i < nabomatrise.length; i++) {
          if(nabomatrise[i][i]) {
            return true;
          }
        }
        return false;
      }
}
