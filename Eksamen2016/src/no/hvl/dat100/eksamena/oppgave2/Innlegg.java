package no.hvl.dat100.eksamena.oppgave2;

import java.util.ArrayList;
import java.util.Iterator;

public class Innlegg {

	private String tekst;
	private ArrayList<String> tagged;

	// a) konstruktør
	public Innlegg(String tekst) {
		this.tekst = tekst;
		tagged = new ArrayList<String>();
	}

	// b) bruker contains metoden på ArrayList (se API dokumentasjon)
	public boolean erTagget(String navn) {
		return (tagged.contains(navn));
	}

	// c)
	public boolean tag(String navn) {

		boolean tagget = false;

		if (!erTagget(navn)) {
			tagged.add(navn);
			tagget = true;
		}

		return tagget;
	}

	// d)
	public ArrayList<String> vennerTagget(String[] venner) {

		ArrayList<String> tagget = new ArrayList<String>();

		for (String ven : venner) {
			if (erTagget(ven)) {
				tagget.add(ven);
			}
		}

		return tagget;
	}

	// e) løsning som bruker en iterator
	public void skrivUt() {

		System.out.println(tekst);
		Iterator<String> it = tagged.iterator();

		while (it.hasNext()) {
			String navn = it.next();

			System.out.print("@" + navn + " ");
		}
	}

	// e) løsning som bruker en utvidet for-løkke
	public void skrivUt1() {

		System.out.println(tekst);

		for (String navn : tagged) {
			System.out.print("@" + navn + " ");
		}

	}

	// e) løsning som bruker et eksplisitt index/posisjon
	public void skrivUt2() {

		System.out.println(tekst);

		for (int i = 0; i < tagged.size(); i++) {
			System.out.print("@" + tagged.get(i) + " ");
		}
	}
}
