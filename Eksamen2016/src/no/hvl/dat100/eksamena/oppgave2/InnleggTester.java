package no.hvl.dat100.eksamena.oppgave2;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class InnleggTester {

	@Test
	public void test() {
		
		Innlegg innlegg = new Innlegg("DAT100 eksamen");
		
		assertTrue(innlegg.tag("Else Vest"));
		
		assertTrue(innlegg.erTagget("Else Vest"));
		assertFalse(innlegg.erTagget("Hans Ost"));
		
		assertTrue(innlegg.tag("Hans Ost"));
		
		String[] venner = {"Else Vest","En annen venn"};
		ArrayList<String> vennertagget = innlegg.vennerTagget(venner);
		
		assertTrue(vennertagget.indexOf("Else Vest") >= 0);
		assertTrue(vennertagget.indexOf("Hans Ost") == -1);
		
		innlegg.skrivUt();
	}

}
