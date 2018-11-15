package no.hvl.dat100.eksamena.oppgave4;

public class Main {

	public static void main(String[] args) {
		
		
		Patient p1 = new Patient("Donald", "2020", 0);

		VenteListe vl = new VenteListe(10);
		
		vl.leggTil(p1);
		
		vl.oppdaterTid(10);
		
		Patient p2 = new Patient("Duck", "1010", 0);
		
		vl.leggTil(p2);
		
		vl.skrivUt();
		
		
		
	}

}
