package no.hvl.dat100;

import java.lang.System.*;

public class EmployeeCollection {
  private Employee[] tab;
  private int nextAvailable;
  
  public EmployeeCollection(int numberOf) {
    tab = new Employee[numberOf];
    nextAvailable = 0;
  }
  public boolean insert(Employee e) {
   if (nextAvailable < tab.length) {
     tab[nextAvailable] = e;
     nextAvailable++;
     return true;
   } else {
     return false;
   }
  }
  private int findFirstname(String firstname) {
    boolean found = false;
    int pos = 0;
    
    while (!found && pos <nextAvailable) {
      if(firstname == tab[pos].getFirstname()) {
         found = true;
      } else {
        pos++;
      }
    }
    //return found;
    if(found) {
      return pos;
    } else {
      return -1;
    }
  }
  public Employee find(String firstname) {
    int p = findFirstname(firstname);
    if(p >= 0) {
      return tab[p];
    } else {
      return null;
    }
  }
  
  public boolean delete(String firstname) {
    int p = findFirstname(firstname);
    if(p >= 0) {
      nextAvailable--;
      tab[p] = tab[nextAvailable];
      tab[nextAvailable] = null;
      return true;
    } else {
      return false;
    }
  }
}
