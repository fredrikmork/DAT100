package no.hvl.dat100;
/*Programmet skal lese inn et beløp og pris (heltall), beløp større
eller lik pris. Ingen sjekk.
Programmet skal beregne veksling (gi tilbake beløp minus pris) i
20-kr, 10-kr og 1-kr, slik at antall 20-kr blir størst mulig, så antall
10-kr (som vil bli 0 eller 1) og deretter antall kroner.
(som vil bli 0 til 9).
*/
import static javax.swing.JOptionPane.*;
import static java.lang.String.format;
//import static java.lang.Integer.*;
import static java.lang.Double.parseDouble;

public class Veksleautomat {
	public static void main(String [] args) {
		double pris = 167;
		String tallTxt = showInputDialog("Varen koster 167kr, skriv inn et beløp du vil betale med");
		double belop = parseDouble(tallTxt);
		double veksel = belop - pris; //Veksel er 133 kr
		double ant100kr = Math.floor(veksel/100); //ant100kr er 1
		veksel = veksel - (ant100kr*100);
		double ant20kr = Math.floor(veksel/20); //ant20kr er 1
		veksel = veksel - (ant20kr*20);
		double ant10kr = Math.floor(veksel/10); //ant10kr er 1
		double ant1kr = Math.floor(veksel%10); //ant 1kr er 3
		
		double tilbakeSum = ant100kr*100+ant20kr*20+ant10kr*10+ant1kr;
		String tall2Txt= "Tolket innlest belop " + format("%4.0f",belop);
		String tilbake =	"\n Belopet tilbake blir " + (tilbakeSum) + " kroner";
		String tall100 = "\n Antall 100 lapper tilbake er" + format("%4.2f",ant100kr)+ "\n";
		String tall20 = "Antall 20 kroninger tilbake er" + format("%4.2f",ant20kr)+ "\n";
		String tall10 = "Antall 10 kroninger tilbake er" + format("%4.2f",ant10kr)+ "\n";
		String tall1 = "Antall 1 kroninger tilbake er" + format("%4.2f",ant1kr)+ "\n";
		
		
		if (tilbakeSum == 0) {
			tilbake = "";
		}
		if (ant100kr == 0) {
			tall100 = "";	
		}
		if (ant20kr == 0) {
			tall20 = "";
		}
		if (ant10kr == 0) {
			tall10 = "";
		}
		if (ant1kr == 0) {
			tall1 = "";
		}
		
		String ut1 = tall2Txt + tilbake + tall100 + tall20 + tall10 + tall1; 		
	
	showMessageDialog(null,ut1);
		
	  }
	}
