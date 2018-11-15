package no.hvl.dat100;

import java.util.ArrayList;

public class Innlegg {
  
  private String tekst;
  private ArrayList <String> tagged; 
  
  public Innlegg(String tekst) {
    this.tekst = tekst;
    this.tagged = new ArrayList<String>();
  }
  
  public boolean erTagget(String person) {
    if(tagged.contains(person)) {
      return true;
    }
    return false;
  }
  
  public boolean tag(String person) {
    if(!tagged.contains(person)) {
      tagged.add(person);
      return true;
    }
    return false;
  }
  
  public ArrayList<String> vennerTagget(String[]venner){
    ArrayList<String> result = new ArrayList<String>();
    
    for(String venn:venner) {
      if(erTagget(venn)) {
        result.add(venn);
      }
    }
    return result;
  }
  
  public void skrivUt() {
    System.out.println(tekst);
    for(String p : tagged) {
      System.out.print("@" + p + " ");
    }
  }
}
