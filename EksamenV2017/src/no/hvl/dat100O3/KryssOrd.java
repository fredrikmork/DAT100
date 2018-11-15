package no.hvl.dat100O3;

import java.util.ArrayList;

public class KryssOrd {
  public static boolean likeLange(String s, String t) {
    return (s.length() == t.length());
  }

  public static boolean matchPos(String s, String t, int p) {
    return (s.charAt(p) == t.charAt(p) || (s.charAt(p) == '*') || (t.charAt(p) == '*'));
  }

  public static boolean matcher(String s, String t) {
    boolean matcher = true;
    if (!likeLange(s, t)) {
      return false;
    } else {
      int pos = 0;

      while (matcher && pos < s.length()) {
        if (!matchPos(s, t, pos)) {
          matcher = false;
        }
        pos++;
      }
    }

    return matcher;

  }

  public static int compareTo(String s, String t) {
    int forskjell;
    
    if (s.length() < t.length()) {
      forskjell = -1;
    } else if(t.length() < s.length()){
      forskjell = 1;
    } else {
      forskjell = s.compareTo(t); 
    }
    
    return forskjell;
  }

   public static String forsteSomPasser(String monster, ArrayList<String> list){
     for(String s : list) {
       if(matcher(s, monster)) {
         return s;
       }
     }
   return null;
   }

}
