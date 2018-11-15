package no.hvl.dat100O4;

public class Heltall extends Oppgave {
  private int korrekt;
  private int feilmargin;
  
  public Heltall(String sporsmaal, int maksPoeng, int korrekt, int feilmargin) {
    super(sporsmaal, maksPoeng);
    this.korrekt = korrekt;
    this.feilmargin = feilmargin;
  }

  @Override
  public double poeng(int svar) {
    if(svar == korrekt) {
      return super.getmaksPoeng();
    } else if(svar >= (korrekt - feilmargin) || svar >= (korrekt + feilmargin)) {
      return (super.getmaksPoeng()/2.0);
    } else {
    return 0.0;
    }
  }

}
