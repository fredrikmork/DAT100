package Oppgave3;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    Pinkoder p1 = new Pinkoder(); 
    p1.registrerPinkode(12345, 1234);
    boolean da = p1.sjekkPinkode(12345, 1234);
    boolean sa = p1.sjekkPinkode(12345, 2222);
    System.out.println(sa);
    System.out.println(da);
  }

}
