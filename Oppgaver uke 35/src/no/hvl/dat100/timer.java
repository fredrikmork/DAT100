package no.hvl.dat100;
/*
 * Vi skal lage et program som regner en tid gitt i hele sekunder om til timer, minutter og sekunder. Antall
 * sekunder leses inn fra dialogboks.
 * Eksempel: 3690 sekunder skal gi som svar 1 timer, 1 minutter og 30 sekunder. 
 */
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class timer {
	
	public static void main(String[]args) {
		String secTxt = showInputDialog("Oppgi et stort tall");
		int restSek = parseInt(secTxt);
		int timer = restSek/3600;
		restSek = restSek - timer * 3600;
		int minutter = restSek/60;
		int sekunder = restSek%60;
		
		String utTimer = null;
		String utMinutter = null;
		String utSekunder = null;
		
		//Timer
		if (timer ==0) {
			utTimer = "";
		} else if (timer==1) {
			utTimer = timer+"Time";
		} else if (timer>1) {
			utTimer = timer+"Timer";
		}
		//Minutter
		if (minutter ==0) {
			utMinutter = "";
		} else if (minutter==1) {
			utMinutter = minutter+"Minutt";
		} else if (minutter>1) {
			utMinutter = minutter+"Minutter";
		}
		//Sekunder
		if (sekunder ==0) {
			utSekunder = "";
		} else if (sekunder==1) {
			utSekunder = sekunder+"Sekund";
		} else if (sekunder>1) {
			utSekunder = sekunder+"Sekunder";
		}
		
		String utTxt = utTimer + utMinutter + utSekunder;
		showMessageDialog(null,utTxt);
	}

}
