package no.hvl.dat100.eksamena.oppgave3;

public class Konverter {

	// f
	public BedriftsKunde tilBedriftKunde(PrivatKunde pkunde) {
		
		int kundernr = pkunde.getKundenummer();
		String navn = pkunde.getBrukernavn();
		String passord = pkunde.getPassord();
		
		BedriftsKunde bkunde = new BedriftsKunde(kundernr,navn,passord,5);
		
		return bkunde;
	}
	
}
