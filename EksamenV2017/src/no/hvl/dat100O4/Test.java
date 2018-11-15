package no.hvl.dat100O4;

public class Test {

  public static void main(String[] args) {
    Oppgave [] samling = new Oppgave[2];
    String s1 = "Hvor mange innbyggere hadde Bergen 1. januar 2016?";
    String s2 = "Hvilket år hadde Norge sist folkeavstemning om medlemsskap i EU?";
    String[] svarAlt = {"ca. 275000", "ca 295000", "ca 315000"};
    samling[0] = new Flervalg(s1, 2, svarAlt, 1);
    samling[1] = new Heltall(s2, 3, 1994, 2);
    
    

  }

}
