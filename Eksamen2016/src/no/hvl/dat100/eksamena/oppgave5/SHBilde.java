package no.hvl.dat100.eksamena.oppgave5;

public class SHBilde {

	static boolean[][] ikon = { { false, false, true, false, false }, { false, false, false, true, false },
			{ true, true, true, true, true }, { false, false, false, true, false },
			{ false, false, true, false, false }, };

	// a)
	public static boolean erSvart(int r, int k) {
		return ikon[r][k];
	}

	// b) vanlig for-løkke
	public static void vis() {
		
		for (int r = 0;r<ikon.length;r++) {
			
			boolean[] rekke = ikon[r];
			
			for (int k = 0; k<rekke.length;k++) {
				
				boolean pixel = rekke[k];
				
				if (pixel) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}
	}
	// b) utvidet for-løkke
	
	public static void vis1() {

		for (boolean[] rekke : ikon) {
			for (boolean pixel : rekke) {
				if (pixel) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
	}

	// c) - vanlig for-løkke er også mulig
	public static boolean flestSvarte() {
		int antall = 0;

		for (boolean[] rekke : ikon) {
			for (boolean pixel : rekke) {
				if (pixel) {
					antall++;
				}
			}
		}

		int antallhvite = ikon.length * ikon.length - antall;

		return (antall > antallhvite);
	}

	// d)
	public static boolean[][] inverter() {

		boolean[][] nyttikon = new boolean[ikon.length][ikon.length];

		for (int r = 0; r < ikon.length; r++) {
			for (int k = 0; k < ikon[r].length; k++) {
				nyttikon[r][k] = !ikon[r][k];
			}

		}

		return nyttikon;
	}
 
	// e)
	public static boolean[][] vennVandrett() {

		boolean[][] nyttikon = new boolean[ikon.length][ikon.length];

		for (int r = 0; r < ikon.length; r++) {
			for (int k = 0; k < ikon[r].length; k++) {
				nyttikon[r][k] = ikon[r][ikon.length - 1 - k];
			}
		}
		
		return nyttikon;
	}
}