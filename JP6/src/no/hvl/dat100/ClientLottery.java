package no.hvl.dat100;
import static java.lang.System.*;

import java.util.Arrays;
public class ClientLottery {
  public static void main(String[]args) {
    Lottery l1 = new Lottery();
    Lottery l2 = new Lottery();
    Lottery l3 = new Lottery();
    Lottery l4 = new Lottery();
    Lottery l5 = new Lottery();
    Lottery l6 = new Lottery();
    Lottery l7 = new Lottery();
    out.println(l1.toString());
    out.println(l2.toString());
    out.println(l3.toString());
    out.println(l4.toString());
    out.println(l5.toString());
    out.println(l6.toString());
    out.println(l7.toString());
    
    /*out.println(l1.toString());
    out.println(l2.toString());
    out.println(l1.isEqual(l2));
    */
//    int [] table = new int[100];
//    int n = 0;
//    
//    for(int i = 0; i < 100; i++) {
//      boolean equal = false;
//      n=0;
//      while(!equal) {
//        Lottery l1 = new Lottery();
//        Lottery l2 = new Lottery();
//        if(l1.isEqual(l2))
//          equal = true;
//        
//        n++;
//        
//      }
//      table[i]=n;
//      out.println(table[i]);
//    }
//    double average = 0;
//    for(int i=0; i<100; i++) {
//      average += table[i];
//      
//    }
//    average = average/100;
//    out.println("Hvor mange ganger den sammenligner tabellene 1 og 2. I snitt blir det: \n"+average);
//  
    Lottery l8 =null;
    int count = 0;
    int table[] = new int[100];
    for(int i= 0; i <100; i++) {
      boolean found = false;
      while(!found) {
        l8 = new Lottery();
        if(l8.isEqual(l1)||l8.isEqual(l2)||l8.isEqual(l3)||l8.isEqual(l4)||l8.isEqual(l5)||l8.isEqual(l6)||l8.isEqual(l7)) {
          found= true;
        }
        count++;
      }
      table[i] =count;
    }
    double average = 0;
    for(int i=0; i<100; i++) {
      average += table[i];
      
    }
    average = average/100;
    out.println(l8.toString());
  }

}
