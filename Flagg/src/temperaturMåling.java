/*
 * Lag et program som presenterer temperaturmplinger på et gitt sted i et søylediagram. 
 * Figuren skal vise temperaturen for hver av dagene i en valgt uke vha. søylehøyder.
 * Slå f.eks. opp på yr.no for å finne temperaturer for et aktuelt sted, og avrund
 * alle verdiene til heltall. I enkleste versjon kan måleverdiene hardkodes. 
 * Utfordringen ligger i å oversette fra temperatur til koordinater.
 * 1 grad = 10 piksler 
 */
import easygraphics.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
//import static java.lang.Double.*;

public class temperaturMåling extends EasyGraphics {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	public static void main(String[]args) {
		launch(args);
	}
	public void run() {
		String mandagTxt = showInputDialog("Skriv inn temperatur på Mandag");
		int mandag = parseInt(mandagTxt);
		String tirsdagTxt = showInputDialog("Skriv inn temperatur på Tirsdag");
		int tirsdag = parseInt(tirsdagTxt);
		String onsdagTxt = showInputDialog("Skriv inn temperatur på Onsdag");
		int onsdag = parseInt(onsdagTxt);
		String torsdagTxt = showInputDialog("Skriv inn temperatur på Torsdag");
		int torsdag = parseInt(torsdagTxt);
		String fredagTxt = showInputDialog("Skriv inn temperatur på Fredag");
		int fredag = parseInt(fredagTxt);
		String lørdagTxt = showInputDialog("Skriv inn temperatur på Lørdag");
		int lørdag = parseInt(lørdagTxt);
		String søndagTxt = showInputDialog("Skriv inn temperatur på Søndag");
		int søndag = parseInt(søndagTxt);
		
		makeWindow("Temperatur ukedager");
		
		setColor(0,0,0);
		fillRectangle(50,300+mandag*(-10),40,mandag*10);
		drawString("Man",50,310);
		drawString(Integer.toString(mandag),50,290+mandag*(-10)); // evt String.valueOf(i)
		setColor(0,0,0);
		fillRectangle(100,300+tirsdag*(-10),40,tirsdag*10);
		drawString("Tir",100,310);
		drawString(Integer.toString(tirsdag),100,290+tirsdag*(-10));
		setColor(0,0,0);
		fillRectangle(150,300+onsdag*(-10),40,onsdag*10);
		drawString("Ons",150,310);
		drawString(Integer.toString(onsdag),150,290+onsdag*(-10));
		setColor(0,0,0);
		fillRectangle(200,300+torsdag*(-10),40,torsdag*10);
		drawString("Tor",200,310);
		drawString(Integer.toString(torsdag),200,290+torsdag*(-10));
		setColor(0,0,0);
		fillRectangle(250,300+fredag*(-10),40,fredag*10);
		drawString("Fre",250,310);
		drawString(Integer.toString(fredag),250,290+fredag*(-10));
		setColor(0,0,0);
		fillRectangle(300,300+lørdag*(-10),40,lørdag*10);
		drawString("Lør",300,310);
		drawString(Integer.toString(lørdag),300,290+lørdag*(-10));
		setColor(0,0,0);
		fillRectangle(350,300+søndag*(-10),40,søndag*10);
		drawString("Søn",350,310);
		drawString(Integer.toString(søndag),350,290+søndag*(-10));
	}
	

}
