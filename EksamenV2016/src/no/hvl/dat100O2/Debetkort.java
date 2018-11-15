package no.hvl.dat100O2;

public class Debetkort extends Betalingskort{
  
  public Debetkort(String navn, int aar, int mnd, double saldo) {
    super(navn, aar, mnd, saldo);
  }
  public boolean dekning(double belop) {
    return getSaldo() >= belop;
  }
}
