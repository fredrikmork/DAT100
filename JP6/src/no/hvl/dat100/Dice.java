package no.hvl.dat100;
import java.util.Random;
public class Dice {
  //Objectvariables
  int [] diceThrow = new int [100];
  Random dice = new Random();
  //ObjectMethod
  public Dice() {
    int i;
    for( i = 0; i<diceThrow.length; i++ ) {
      diceThrow[i] = dice.nextInt(6)+1;
    }
  }
  public int diceThrow() {
    int number = 0;
    number = diceThrow.length;
    return number;
  }
  
  public int [] throwDice() {
    int i;
    int [] numberOfThrows = new int[7];
    for(i = 0; i<diceThrow.length; i++) {
       numberOfThrows[diceThrow[i]]++;
    }
    return numberOfThrows;
  }
  public String table() {
    int i;
    int [] numberOfThrows = throwDice();
    String print = "";
    for(i = 1;i<numberOfThrows.length; i++) {
      print += "Antall" + i + ": " + numberOfThrows[i] + "\n";
    }
    return print; 
  }  
  public double average() {
    double average = 0.0;
    double sum = 0.0;
    for(int i = 0; i<diceThrow.length; i++) {
      sum +=  diceThrow[i];
    }
    average = sum / diceThrow.length;
    return average;
  }
  public int findSix() {
    boolean found = false;
    int i = 0;
    while(!found) {
      if(diceThrow[i] == 6)
        found = true;
      i++;
    }
    return i;
  }
  public int mostOf() {
    int index = 0;
    int [] numberOfThrows = throwDice();
    for(int i = 1;i<numberOfThrows.length; i++) {
      if(numberOfThrows[index] < numberOfThrows[i])
        index = i;
    }
    return index;
  }
  @Override
  public String toString() {
    String print = "";
    int j;
    for( j = 0; j<diceThrow.length; j++) {
      print += "    " + diceThrow[j];
      if( (j+1) % 20 == 0 ) {
        print += "\n";
      }
    }
    return print;
  } 
  public String print() {
    String printToString = toString();
    String printDiceThrow = "Antall kast: " + mostOf();
    String printTable = table();
    String printAverage = "Gjennomsnittskast: " + average();
    String printFindSix = "Antall kast det tok før 6 dukket opp: " + findSix();
    String printMostOf = "Terningen med flest kast: " + mostOf();
    return printToString + "\n" + printDiceThrow + "\n" + printTable + "\n" + printAverage + "\n" + printFindSix + "\n" + printMostOf;
  }
}