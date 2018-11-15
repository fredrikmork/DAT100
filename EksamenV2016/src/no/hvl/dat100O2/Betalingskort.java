package no.hvl.dat100O2;
import java.util.*;
public abstract class Betalingskort {
  
  private String navn;
  private int aar;
  private int mnd;
  private double saldo;
  
  public abstract boolean dekning(double belop);
  
  public Betalingskort(String navn, int aar, int mnd, double saldo) {
    this.navn = navn;
    this.aar = aar;
    this.mnd = mnd;
    this.saldo = saldo;
  }
  
  public void innskudd(double belop) {
     saldo = saldo + belop;
  }
  
  public boolean erGyldig() {
    boolean gyldig = false;
    boolean aaar = false;
    boolean mnnd = false;
    Calendar c = Calendar.getInstance();
    int m = c.get(Calendar.MONTH);
    int y = c.get(Calendar.YEAR);
    
    if(getAar() > y) {
      gyldig = true;
    } else if(getAar() == y) {
      aaar = true;
      if((getMnd()-1) >= m) {
        mnnd = true; 
      }
    } 
    
    if(mnnd && aaar) {
      gyldig = true;
    }
    return gyldig;
  }
  
  public boolean trekk(double belop) {
    boolean strykMeg = false;
    if(erGyldig() && dekning(belop)) {
      saldo = saldo - belop;
      strykMeg = true;
    }
    return strykMeg;
  }

  public String getNavn() {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  public int getAar() {
    return aar;
  }

  public void setAar(int aar) {
    this.aar = aar;
  }

  public int getMnd() {
    return mnd;
  }

  public void setMnd(int mnd) {
    this.mnd = mnd;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
  
}
