package no.hvl.dat100;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.lang.String;

public class Lottery {
  //ObjectVariable array
  private int[] stringOfNumber;
  //Constructor without parametre
  public Lottery() {
    stringOfNumber = new int[7];
    for (int i = 0; i<stringOfNumber.length; i++) {
      stringOfNumber[i] = randomNumbers();
    }
    Arrays.sort(stringOfNumber);
  }
  //OMethods
  private int randomNumbers() {
    Random number = new Random();
    return number.nextInt(34)+1;
  }
  public boolean isEqual(Lottery l) {
    boolean equal = false;
    if (Arrays.equals(stringOfNumber, l.stringOfNumber))
      equal = true;
    return equal;
  }
  //to string
  public String toString() {
    String print = "[ ";
    for (int i = 0; i<stringOfNumber.length; i++) {
      print += stringOfNumber[i] + " ";
    }
    print += "]";
    return print;
  }
  
}
