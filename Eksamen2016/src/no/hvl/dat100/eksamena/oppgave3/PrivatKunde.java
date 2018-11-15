package no.hvl.dat100.eksamena.oppgave3;

public class PrivatKunde extends Kunde {

	// c
	private int avslag;
	private double grense;
	private double total;
	
	// d
	public PrivatKunde(int kundenummer, String brukernavn, String passord, int avslag, double grense, double total) {
		super(kundenummer,brukernavn,passord); // obs
		this.avslag = avslag;
		this.grense = grense;
		this.total = total;
	}
	
	public int getAvslag() {
		return avslag;
	}
	public void setAvslag(int avslag) {
		this.avslag = avslag;
	}
	public double getGrense() {
		return grense;
	}
	public void setGrense(double grense) {
		this.grense = grense;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double betal(double belop) {
				
		double betale;
		
		if (total >= grense) {
			// over grensen før kjøp - avslag på hele beløpet
			betale = belop - ((belop * avslag) / 100); 
		} else if (total + belop > grense) {
			// nytt kjøp gjør at grensen passerers
			double avslagbelop = (total + belop) - grense;
			betale = belop - ((avslagbelop * avslag) / 100);
		} else {
			// grense ikke nådd ved kjøp
			betale = belop; 
		} 
		
		total = total + betale;
		
		return betale;
	}
}
