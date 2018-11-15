package no.hvl.dat100;

public class Main {

  public static void main(String[]args) {
    Firkant f1 = new Firkant();
    Sirkel s1 = new Sirkel();
    Romskip r1 = new Romskip();
    Tegnbar [] tab = {f1,s1,r1};
    
    for(Tegnbar t: tab) {
      System.out.println(t.tegnOpp());
    }
  }

}
