package no.hvl.dat100O2;

public class Kredittkort extends Betalingskort{
  private double kredittgrense;
  
  public Kredittkort(String navn, int aar, int mnd, double saldo, double kredittgrense) {
    super(navn, aar, mnd, saldo);
    this.kredittgrense = kredittgrense;
  }
  public boolean dekning(double belop) {
    return belop <= getSaldo() + kredittgrense;
  }
  
}
