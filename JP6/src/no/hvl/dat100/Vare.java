package no.hvl.dat100;

public class Vare {
  //Objectvariables
  private int varenr;
  private String navn;
  private double pris;
  //Standard-constructor
  public Vare() {
    varenr = 0;
    navn = null;
    pris = 0.0;
  }
  //Constructor
  public Vare(int varenr, String navn, double pris) {
    this.varenr = varenr;
    this.navn = navn;
    this.pris = pris;
  }
  //Objectmethods
  public double moms() {
    double moms = 0.2*pris;
    moms = (int)((moms * 100.0 + 0.5)/100.0); //runder til to desimaler
    return moms;
  }
  public boolean billigereEnn(Vare v) {
    boolean billigereEnn = false;
    if(pris < v.pris) 
      billigereEnn = true;
    return billigereEnn;
  }
  //Getters & setters
  public int getVareNr() {
    return varenr;
  }
  public void setVareNr(int varenr) {
    this.varenr = varenr;
  }
  public String getNavn() {
    return navn;
  }
  public void setNavn(String navn) {
    this.navn = navn;
  }
  public double getPris() {
    return pris;
  }
  public void setPris(double pris) {
    this.pris = pris;
  }
  //toString metode
  public String toBilligere(Vare v) {
    String txt = "";
    if(billigereEnn(v))
      txt = navn + " er billigere enn " + v.navn;
    else if (navn == v.navn)
      txt = navn + " er like dyrt som " +v.navn;
    else
      txt = navn + " er ikke billigere enn " + v.navn;
    return txt;
  }
  @Override
  public String toString() {
    String print = "Navn: " + navn + "  Pris: " + pris + "\nDerav moms: " + moms() + "  Varenr.:" + varenr + "\n\n";
    return print;
  }
}