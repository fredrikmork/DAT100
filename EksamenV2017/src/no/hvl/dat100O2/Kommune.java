package no.hvl.dat100O2;

public class Kommune {
  
  
  private String navn;
  private double areal;
  private int folketall;
  
  public Kommune(String navn, double areal, int folketall) {
    this.navn = navn;
    this.areal = areal;
    this.folketall = folketall;
  }
  
  public double tetthet() {
    return folketall/areal;
  }
  
  public String getNavn() {
    return navn;
  }
  public void setNavn(String navn) {
    this.navn = navn;
  }
  public double getAreal() {
    return areal;
  }
  public void setAreal(double areal) {
    this.areal = areal;
  }
  public int getFolketall() {
    return folketall;
  }
  public void setFolketall(int folketall) {
    this.folketall = folketall;
  }
  
  public String toString() {
    String print;
    print = navn + ", Folketall: " + folketall + ", Fastlandsareal: " + areal + "km2";
    return print;
  }
}
