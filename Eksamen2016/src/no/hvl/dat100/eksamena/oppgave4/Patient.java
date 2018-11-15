package no.hvl.dat100.eksamena.oppgave4;

public class Patient {

	// a)
	private String navn;
	private String fodselsnummer;
	private int dager;
	
	public Patient(String navn, String fodselsnummer, int dager) {
		this.navn = navn;
		this.fodselsnummer = fodselsnummer;
		this.dager = dager;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getFodselsnummer() {
		return fodselsnummer;
	}

	public void setFodselsnummer(String fodselsnummer) {
		this.fodselsnummer = fodselsnummer;
	}

	public int getDager() {
		return dager;
	}

	public void setDager(int dager) {
		this.dager = dager;
	}
	
	// b)
	public String toString() {
		return navn + "\n" + 
			   fodselsnummer + "\n" + 
			   dager;
	}
}
