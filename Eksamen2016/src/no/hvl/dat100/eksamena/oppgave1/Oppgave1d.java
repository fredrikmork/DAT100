package no.hvl.dat100.eksamena.oppgave1;

public class Oppgave1d {

	public static void a(int x) {
	  
		try {
			b(x - 5);
		} catch (Exception exn) {
			System.out.println("C");
		}
	}

	public static void b(int x) throws Exception {

		System.out.println("D");

		if (x == 0) {
			Exception e = new Exception("E");
		  throw e;
		} else {
			System.out.println("F");
		}
	}

	public static void main(String[] args) {
		System.out.println("A");

		a(5);

		System.out.println("B");

	}

	/*
	 * sjekkede unntak - må håndteres eller videreformidles via throws. 
	 * Subklasser av Exception som ikke er subklasser av RunTimeException
	 * Ofte pga. ekterns hendelser
	 *
	 * usjekkede unntak - subklasser av RunTimeException. Ikke noe krav at de håndteres 
	 * eller videreformidles.
	 * Signalerer i hovedsak programmeingsfeil.
	 * 
	 */
}
