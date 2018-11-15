package no.hvl.dat100;
import static java.lang.System.*;
public class FigurTest {

  public static void main(String[] args) {
    Rektangel rekt = new Rektangel(5,3);
    out.println(rekt.areal());
    rekt.tegn('#');
    
    Trekant tri = new Trekant(5,3);
    out.println(tri.areal());
    tri.tegn('*');
    Trekant tri2 = new Trekant(5, 3);
    out.println(tri.equals(tri2));
    
    Figur[] fT = new Figur [5];
    fT[0] = new Trekant(2, 4);
    fT[1] = new Rektangel(3, 3);
    fT[2] = new Trekant(1, 4);
    fT[3] = new Rektangel(4, 3);
    
    double samletAreal = 0.0;
    for (Figur f : fT) {
      if( f != null) {
        samletAreal += f.areal();
      }
    }
    out.println(samletAreal);
  }

}