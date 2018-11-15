package no.hvl.dat100O2;

public class Oppgave2 {
  
  public static String land(String kode) {
    String land ="";
    int foobar = Integer.parseInt(kode.substring(0, 3));
    switch(foobar) {
      case 57: land = "Danmark";
               break;
      case 59: land = "Sverige";
               break;
      case 64: land = "Finland";
               break;
      case 70: land = "Norge";
               break;
      case 569:land = "Island";
               break;
      default: land = "Andre";
               break;
    }
    return land;
  }
  
  public static boolean lovligKode(String kode) {
    int sumPar = 0;
    int sumOdd = 0;
    int lovlig = 0;
    boolean strykMeg = false;
    int toppKarakter = 0;
    
    toppKarakter = Integer.parseInt(Character.toString(kode.charAt(kode.length())));
    
    for(int i = 0; i < kode.length(); i++) {
      if(i % 2 == 0) {
        sumPar += Integer.parseInt(Character.toString(kode.charAt(i))) ;
      } else {
        sumOdd += Integer.parseInt(Character.toString(kode.charAt(i))) * 3;
      }
    }
    
    lovlig = sumPar + sumOdd + toppKarakter;
    if(lovlig % 10 == 0) {
      strykMeg = true;
    }
    return strykMeg;
  }
  
  public static boolean alleLovlige(String [] koder) {
    boolean [] heihå = new boolean [koder.length];
    boolean strykMeg = false;
    
    for(int i = 0; i < koder.length; i++) {
      if(lovligKode(koder[i])) {
        heihå[i] = true;
      }
        heihå[i] = false;
    }
    int count = 0;
    for(boolean b : heihå) {
      if(!b) {
        count += 1;
      }
    }
    if(!(count > 0)) {
      strykMeg = true;
    }
    return strykMeg;
  }
  
  
  
}