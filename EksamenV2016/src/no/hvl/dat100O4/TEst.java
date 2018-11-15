package no.hvl.dat100O4;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class TEst {
  
    public static void main (String []args) {
      
      Varesamling varetabell = new Varesamling (1000);
      //varetabell.lesFraFil();
      Vare lettmelk = new Vare("Lettmelk",3230, 16.0);
      varetabell.leggTil(lettmelk);
      
      boolean ferdig = false;
      do {
        String talltxt = "Skriv varenr.";
        String talltxt2 = "Skriv antall:";
        int varenr = parseInt(showInputDialog(talltxt));
        int antall = 0;
        
        if (varenr == 0){
            System.out.println("Ferdig");
            ferdig = true;
        } else if(varenr != 0) {
            antall = parseInt(showInputDialog(talltxt2));
            System.out.println(antall + " " + varetabell.finnVare(varenr).getNavn() 
              + " " + (antall * varetabell.finnVare(varenr).getPris()));
        } else if (varetabell.finnVare(varenr) == null) {
            System.out.println("Ukjent varenummer");
        }
        
        
        
      } while(!ferdig);
      
      
    }
    
}
