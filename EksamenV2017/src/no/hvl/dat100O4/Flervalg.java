package no.hvl.dat100O4;

public class Flervalg extends Oppgave {
  private String [] alternativ;
  private int korrekt;
  
  public Flervalg (String sporsmaal, int maksPoeng, String [] tab, int korrekt) {
    super(sporsmaal, maksPoeng);
    this.alternativ = tab;
    this.korrekt = korrekt;
  }
  @Override
  public double poeng(int svar) {
    if(svar == korrekt) {
      return super.getmaksPoeng();
    }
    return 0;
  }

}
