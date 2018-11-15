package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class VareGrensesnitt {
  
  public Vare lesVare() {
    String tallTxt = showInputDialog("Oppgi varenummer: ");
    int varenr = parseInt(tallTxt);
    String vareNavn = showInputDialog("Oppgi varenavn: ");
    String tallTxt2 = showInputDialog("Oppgi pris: ");
    double pris = parseInt(tallTxt2);
    Vare vare = new Vare(varenr, vareNavn, pris);
    return vare;
  }
  
  
  
  


}
