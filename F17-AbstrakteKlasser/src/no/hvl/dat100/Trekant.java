package no.hvl.dat100;
import static java.lang.System.*;

public class Trekant extends Figur {
  private int høyde;
  private int grunnlinje;
  @Override
  public double areal() {
    return (høyde*grunnlinje)/2;
  }
  public Trekant(int h, int g) {
    høyde = h;
    grunnlinje = g;
  }
  @Override
  public void tegn(char t) {
    for(int i = 0; i < høyde; i++) {
      for (int j = 0; j < i + 1; j++) {
        out.print(t);
      }
      out.println();
    }
  }
  @Override
  public boolean equals(Object annen) {
    if ( this == annen) {
      return true;
    }
    if (annen == null || !(annen instanceof Trekant)) {
      return false;
    } 
    Trekant tri = (Trekant) annen;
    return høyde == tri.høyde && grunnlinje == tri.grunnlinje;
  }
}
