package no.hvl.dat100;

public class Oppg4repLøk {
  /*
   * Ved å bruke Math-klassen får du tilgang til matematiske funksjoner som sinus og cosinus ved å bruke Math.sin(x) og Math.cos(x) i koden. 
   * Når du f.eks. skal regne ut verdien y = sin(x), må x være i radianer.
     Lag en enkel klasse der du i main-metoden skriver ut en tabell over sinus og cosinus til alle vinkler mellom 0 og 180 grader, i steg på 15 grader.
     Omregning mellom grader og radianer gjør du ved formelen:
     vinkel i radianer = (π * vinkel i grader) / 180
     Verdien π finst i Math-klassen som konstanten Math.PI.
   */
  public static void main(String[] args) {
    
    double [] grader =  {0, 15, 30, 60, 75, 90, 105, 120, 135, 150, 165, 180}; //opprinnelig dataoppsett
    
    for (int i=0; i<grader.length; i++) {
      System.out.print("Grader\tRadianer \t\t Sinus(x)\t\tCosinus(x) \n"); 
      System.out.print(grader[i] + "   "); 
      double vinkelR =Math.toRadians(grader[i]); //istedenfor Math.pi*grader/180, bruker jeg 
      System.out.print(vinkelR + "  ");
      System.out.print(Math.sin(vinkelR) + "  "); //regner om sinus fra radianer
      System.out.println(Math.cos(vinkelR)); //regner om cosinus fra radianer
      System.out.println("");
      //"%.3g%n"  -  3 desimaler
    }
    
  }

}
