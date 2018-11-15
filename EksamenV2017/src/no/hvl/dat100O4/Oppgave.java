package no.hvl.dat100O4;

public abstract class Oppgave {
  private String sporsmaal;
  private int maksPoeng;
  
  public Oppgave(String sporsmaal, int maksPoeng) {
    this.sporsmaal = sporsmaal;
    this.maksPoeng = maksPoeng;
  }
  
  public abstract double poeng(int svar);
  
  public String getSporsmaal() {
    return sporsmaal;
  }
  
  public void setSporsmaal(String sporsmaal) {
    this.sporsmaal = sporsmaal;
  }
  
  public int getmaksPoeng() {
    return maksPoeng;
  }
  
  public void setmaksPoeng(int maksPoeng) {
    this.maksPoeng = maksPoeng;
  }
  
  
}
