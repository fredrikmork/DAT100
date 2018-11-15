package no.hvl.dat100.eksamena.oppgave3;

public class BedriftsKunde extends Kunde {

	// c)
	private int rabatt;
	
	// d)
	public BedriftsKunde(int kundenummer, String brukernavn, 
			             String passord,int rabatt) {
		super(kundenummer,brukernavn,passord); // obs
		this.rabatt = rabatt;
	}
	
	public double betal(double belop) {
		return (belop - ((belop * rabatt) / 100)); 
	}
	
}
