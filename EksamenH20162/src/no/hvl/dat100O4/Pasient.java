package no.hvl.dat100O4;

public class Pasient {
  private String navn;
  private String fodselsnummer;
  private int dager;
  
  public Pasient(String navn, String fodselsnummer, int dager) {
    this.navn = navn;
    this.fodselsnummer = fodselsnummer;
    this.dager = dager;
  }
  public String getNavn() {
    return navn;
  }
  public void setNavn(String navn) {
    this.navn = navn;
  }
  public String getFodselsnummer() {
    return fodselsnummer;
  }
  public void setFodselsnummer(String fodselsnummer) {
    this.fodselsnummer = fodselsnummer;
  }
  public int getDager() {
    return dager;
  }
  public void setDager(int dager) {
    this.dager = dager;
  }
  @Override
  public String toString() {
    return getNavn() + "\n" + getFodselsnummer() + "\n" + getDager();
  }
}
