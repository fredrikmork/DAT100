package no.hvl.dat100;
import static java.lang.System.out;

public class ClientSquare {
  
  public static void main(String[]args) {
    
    Square sq3 = new Square(3);
    Square sq4 = new Square(4);
    Square sq5 = new Square(5);
    
    out.println(sq3.toText());
    out.println(sq3.toStar());
    
    out.println(sq4.toText());
    out.println(sq4.toStar());
    
    out.println(sq5.toText());
    out.println(sq5.toStar());
    
    out.println(sq5.sum(sq3, sq4));
  }
  
}
