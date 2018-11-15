package no.hvl.dat100;

public class Eksperiment {
	 public static void main(String[] args) {
	 int a = 5;							//lager en heltall variabel 5 på a
	 String s = "Hei";					//Skriver en text s=Hei
	 double b = 4.2;           			//funker når gjort om til double
	 System.out.println(a);				//skriver ut 5
	 System.out.println(s);				//skriver ut Hei
	 System.out.println(b);    			//funker når b bl gjort om til double skriver ut 4.2
	 System.out.println(s + a + 3);		//skriver ut Hei53
	 System.out.println(3 + a + s);		//skriver ut 35Hei
	 System.out.println(s);  			//feil fordi du kan ikke ta vekk en bokstav fra en string
	 System.out.println(7 / a);			//skriver ut 1
	 System.out.println(13 - 2*5); 		//feil fordi mangler et riktig minustegn
	 int c = 1578;						//Lager en heltall variabel på c= 1578
	 System.out.println(Integer.toString(c).length());		//måtte overføre int til string
	 System.out.println(s.length());     //
	 }
	}
