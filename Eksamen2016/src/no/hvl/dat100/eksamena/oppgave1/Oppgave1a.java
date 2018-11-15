package no.hvl.dat100.eksamena.oppgave1;

public class Oppgave1a {

	public static void oppgave1a() {

		int x = 4;
		int y = 10;

		System.out.println(x * 4 + y * 3); // precedens

		System.out.println("x * y = " + x * y);

		System.out.println(x != y);

		String s = "dat100";
		System.out.println(s.substring(1, 3).equals("dat")); // [1..3[
	}

	public static void main(String[] args) {

		oppgave1a();

	}

}
