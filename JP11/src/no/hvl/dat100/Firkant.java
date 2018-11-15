package no.hvl.dat100;

public class Firkant implements Tegnbar{
  
  private final int TALL = 5;
  String print = "";
  
  public String tegnOpp() {
   
    for(int i = 0; i < TALL; i++) {
      for(int j = 0; j < TALL; j++) {
        print += "* ";
      }
      print += "\n";
    }
    return print;
  }

}
