package no.hvl.dat100;
/*
 *Lag et program som ber brukeren om å skrive inn en dato
 *som tre heltall: Et dagnummer, et månedsnummer og et årstall.
 *Skriv datoen ut på vanlig måte med punktum som skilletegn, f.eks. 4.11.2013.
 */
import java.text.DateFormat;
import java.util.Date; //importerer date og dateframe fra biblioteket
public class utskriftAvDato {
	
	public static void main(String[]args) {
		
		Date now = new Date(); //lager en date variabel som heter now og henter dagens dato
		DateFormat shortDf = DateFormat.getDateInstance(DateFormat.SHORT); // bruker et kort dato format som punktum mellom dag og måned.
		System.out.println(shortDf.format(now));
	}

}
