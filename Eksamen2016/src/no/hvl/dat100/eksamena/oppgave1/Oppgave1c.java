package no.hvl.dat100.eksamena.oppgave1;

public class Oppgave1c {

	public static void oppgave1c() {

		int[] tab = { 1, 2, 3, 4, 5, 6 };
		
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		oppgave1c();

	}

}
