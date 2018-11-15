package no.hvl.dat100;
import static java.lang.System.*;
public class Rektangel extends Figur{
  private int høyde;
  private int bredde;
  //Konstruktører
  public Rektangel (int h, int b) {
    høyde = h;
    bredde = b;
  }
  //Get&Set
  public int getHøyde() {
    return høyde;
  }
  public void setHøyde(int høyde) {
    this.høyde = høyde;
  }
  public int getBredde() {
    return bredde;
  }
  public void setBredde(int bredde) {
    this.bredde = bredde;
  }
  //Objektmetoder
  @Override
  public double areal() {
    return høyde*bredde;
  }
  @Override
  public void tegn(char t) {
    for (int i = 0; i < høyde; i++) {
      for (int j = 0; j < bredde; j++) {
        out.print(t);
      }
      out.println();
    }
  }
}
