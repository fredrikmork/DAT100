package no.hvl.dat100.eksamena.oppgave4;

public class VenteListe {

	// c)
	private Patient[] samling;
	private int antall;

	public VenteListe(int antall) {
		samling = new Patient[antall];
		this.antall = 0;
	}
	
	// d)
	public void skrivUt() {
		
		for (int i = 0; i<antall;i++) {
			System.out.println(samling[i].toString());
		}
		
	}
	
	// e)
	public void oppdaterTid(int dager) {
		
		for (int i = 0; i<antall; i++) {
			int d = samling[i].getDager();
			samling[i].setDager(d + dager);
		}
	}
	
	// f) 
	public boolean leggTil(Patient patient) {
		
		boolean funnet = false;
		boolean sattinn = false;
	
		// sjekk først om pasienten finnes allerede
		int i = 0;
		while (i<antall && !funnet)
		
			if (samling[i].getFodselsnummer().equals(patient.getFodselsnummer())) {
				funnet = true;
			} else {
				i++;
			}
		
		if (!funnet && antall < samling.length) {
			samling[antall] = patient;
			antall++;
			sattinn = true;
		}
		
		return sattinn;
	}
	
	// g)
	public Patient ventetLengst() {

		Patient patient = null;
		
		if (antall>0) {
			patient = samling[0];
		}
		
		for (int i = 1;i<antall;i++) {
			Patient nestepasient = samling[i];
			
			if (patient.getDager() < nestepasient.getDager()) {
				// neste pasient har ventet lengre
				patient = nestepasient;
			}
		}
		
		return patient;
	}
}
