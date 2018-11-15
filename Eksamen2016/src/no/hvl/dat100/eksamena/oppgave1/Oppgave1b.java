package no.hvl.dat100.eksamena.oppgave1;

public class Oppgave1b {

	// bruk kladde papir underveis ...
	public static int cmp(int x, int y) {

		int v;
		if (x > y) {
			v = 1;
		} else if (x < y) {
			v = -1;
		} else {
			v = 0;
		}

		return v;
	}

	public static void main(String[] args) {

		int a = 42;
		int z = cmp(a, 31);
		System.out.println(z);
	}

}
