package Oppgave3;

import java.util.HashMap;

public class Pinkoder {
  
  private HashMap <Integer, Integer> pinkoder;
  
  //inneheld ein HashMap som kan avbilde eit kortnummer til ein pinkode. 
  //Konstruktøren for klassen skal opprette ein ny HashMap
  public Pinkoder() {
    this.pinkoder = new HashMap<Integer, Integer>();
  }
  //registerer kortnummeret gitt ved kortnummer med pinkoden pinkode
  public void registrerPinkode(Integer kortnummer, Integer pinkode) {
    pinkoder.put(kortnummer, pinkode);
  }

//  sjekker om pinkode er den korrekte pinkoden for kortet gitt med parametren kortnummer. Metoden skal
//  fungere også om kortet ikkje finst i HashMap’en over pinkodar.
  public boolean sjekkPinkode(int kortnummer, int pinkode) {
    int p = pinkoder.get(kortnummer);
    if(p == pinkode) {
      return true;
    } 
    return false;
  }
  
  
  
  //Getters & Setters
  /*
  public int getKortnummer() {
    return kortnummer;
  }
  
  public void setKortnummer(int kortnummer) {
    this.kortnummer = kortnummer;
  }
  
  public int getPinkode() {
    return pinkode;
  }
  
  public void setPinkode(int pinkode) {
    this.pinkode = pinkode;
  }
  
  public HashMap <Integer, Integer> getPinkoder() {
    return pinkoder;
  }
  public void setPinkoder(HashMap <Integer, Integer> pinkoder) {
    this.pinkoder = pinkoder;
  }
  
  @Override
  public String toString() {
    String print = 
    return print;
  }
  */
}
