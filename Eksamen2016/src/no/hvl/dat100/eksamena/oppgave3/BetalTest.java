package no.hvl.dat100.eksamena.oppgave3;

import static org.junit.Assert.*;

import org.junit.Test;

public class BetalTest {

	@Test
	public void testPrivat() {
		
		PrivatKunde pkunde = new PrivatKunde(1234, "pkunde", "1", 50, 1000, 0);
		
		double b1 = pkunde.betal(500);
		assertEquals(500.0,b1,0.1);
		
		double b2 = pkunde.betal(800);
		assertEquals(500.0 + 150.00,b2,0.1);
		assertEquals(b1+b2,pkunde.getTotal(),0.1);
		
		double b3 = pkunde.betal(500);
		assertEquals(250.0,b3,0.1);
		assertEquals(b1+b2+b3,pkunde.getTotal(),0.1);
	}

	@Test
	public void testBedrift() {
		
		BedriftsKunde bkunde = new BedriftsKunde(1234, "pkunde", "1", 50);
		
		double b1 = bkunde.betal(1000);
		assertEquals(500,b1,0.1);
	}
}
