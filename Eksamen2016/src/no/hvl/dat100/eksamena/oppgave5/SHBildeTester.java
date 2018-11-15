package no.hvl.dat100.eksamena.oppgave5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SHBildeTester {

	public static void vis(boolean[][] ikon) {

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
	
	@Test
	public void test() {
		assertTrue(SHBilde.erSvart(0,2));
		assertFalse(SHBilde.erSvart(1,2));
		
		SHBilde.vis();
		System.out.println();
		
		assertFalse(SHBilde.flestSvarte());
		
		boolean[][] nyttikon = SHBilde.inverter();
		
		vis(nyttikon);
		System.out.println();
		
		nyttikon = SHBilde.vennVandrett();
		
	    vis(nyttikon);
	    System.out.println();
	}

}
