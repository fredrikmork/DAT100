package no.hvl.dat100;
//Lag en klasse med en enkel main() – metode for å teste klassene over. I main() skal du først lage en
//tabell av referanser til fire Person-objekter. Opprett to Student-objekter og to Lærer-objekter der
//du gir data direkte inn i parameterlista på alle fire.
//Gå gjennom tabellen og skriv ut alle data om de fire objektene. 
import static java.lang.System.*;

public class TestPerson {
  public static void main(String[]args) {
    Person persons [] =  {new Teacher("Mørk", "Fredrik", 1997, 'm', 12899, 1),
                          new Teacher("Gjerde", "Simen", 1997, 'm', 12233, 2),
                          new Student("Rinde", "Sondre", 1998, 'm', 12, "DAT100"),
                          new Student("Gjesdal", "Sondre", 1998, 'm', 13, "DAT100")
                          };
    for(int i = 0; i < persons.length; i++) {
      out.println();
    }
  }
}
