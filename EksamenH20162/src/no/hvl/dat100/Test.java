package no.hvl.dat100;

import java.util.ArrayList;

public class Test {
  public static void main(String[]args) {
    Innlegg i = new Innlegg("hei");
    i.tag("Haakon");
    i.tag("Karo");
    i.skrivUt();
    String [] venner = {"Mamma", "pappa", "Haakon"};
    ArrayList<String> taggedeVenner = i.vennerTagget(venner);
    System.out.println(taggedeVenner.toString());
  }
  
}
