package no.hvl.dat100.eksamena.oppgave3;


public abstract class Kunde {

	// a
	private int kundenummer;
	private String brukernavn;
	private String passord;
	
	public Kunde(int kundenummer, String brukernavn, String passord) {
		this.kundenummer = kundenummer;
		this.brukernavn = brukernavn;
		this.passord = passord;
	}
	
	// kan antas i de følgende oppgaver
	public int getKundenummer() {
		return kundenummer;
	}
	
	public void setKundenummer(int kundenummer) {
		this.kundenummer = kundenummer;
	}
	
	public String getBrukernavn() {
		return brukernavn;
	}
	
	public void setBrukernavn(String brukernavn) {
		this.brukernavn = brukernavn;
	}
	
	public String getPassord() {
		return passord;
	}
	
	public void setPassord(String passord) {
		this.passord = passord;
	}
	
	// b)
	public abstract double betal(double belop);
	
}
