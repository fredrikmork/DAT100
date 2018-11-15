package no.hvl.dat100;

public class Objektsamling {
  private Element[] tab;
  private int nextAvailable;
  
  public Objektsamling(int number) {
    tab = new Element[number];
    nextAvailable = 0;
  }
  
  public boolean place(Element a) {
    return true;
  }
  

  private int findPos(String s){
    boolean found = false;
    int p = 0;
    while(!found && p < nextAvailable) {
      if(s.equals(tab[p].key())) {
        found = true;
      } else {
        p++;
      }
    }
    if(found) {
      return p;
    } else {
      return -1;
    }
  }
  public Element find(String s) {
    return null;
  }
  public boolean slett(String s) {
    return true;
  }
}
