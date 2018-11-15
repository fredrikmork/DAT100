package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg2lønnstrinn {
  public static void main(String[]args) {
    // int sum1=0;
    boolean gyldigInndata;
    String tallTxt= "";
    String melding = "Tast inn lønnen din";
    String feilmelding = "Det går ikke an å ha negativ lønn, tast inn på nytt.";
    int n = 0;
    //= (trinn1 >= 164101 && trinn1 <= 230950);
    do {
      tallTxt = showInputDialog(null, melding);
      n = parseInt(tallTxt);
      gyldigInndata = (n>0);
      if(!gyldigInndata) {
        showMessageDialog(null, feilmelding);
      }
    }while (!gyldigInndata);
    
    int trinn1 = 164101;
    int trinn2 = 230951;
    int trinn3 = 580651;
    int trinn4 = 934051;
   
    if (n>= trinn1 && n<=trinn2) {
      double sats1 = round(n*0.0093);
      showMessageDialog(null,"Du tjener: "+n + "kr, og betaler " + Double.toString(sats1) + "kr i sats, og har trinnskatt 1");
    } else if (n >= trinn2 && n <= trinn3) {
      double sats2 = round(n*0.0241);
      showMessageDialog(null,"Du tjener: "+n + "kr, og betaler " + Double.toString(sats2) + "kr i sats, og har trinnskatt 2");
    }
    else if (n>= trinn3 && n<=trinn4) {
      double sats3 = round(n*0.1152);
      showMessageDialog(null,"Du tjener: "+n + "kr, og betaler " + Double.toString(sats3) + "kr i sats, og har trinnskatt 3");
    }
    else if (n>trinn4) {
      double sats4 = round(n*0.1452);
      showMessageDialog(null,"Du tjener: "+n + "kr, og betaler " + Double.toString(sats4) + "kr i sats, og har trinnskatt 4");
    }
    else if (n<trinn1) {
      showMessageDialog(null,"Du tjener: "+n + "kr, og betaler ikke sats, og har trinnskatt 0");
    }
  }

}
