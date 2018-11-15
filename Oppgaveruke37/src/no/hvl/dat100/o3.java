package no.hvl.dat100;

import java.time.Duration;
import java.util.Arrays;

public class o3 {
  public static double[] tabellen = new double[150000000];

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    for (int i = 0; i < tabellen.length; i++) {
      tabellen[i] = (int) Math.floor(Math.random() * 101);

    }
    long startTime = System.currentTimeMillis();
    Arrays.sort(tabellen);
    long endTime = System.currentTimeMillis();

    long timeDiff = (endTime - startTime);
    long duration = (timeDiff);
    System.out.print(duration + "ms");
  }

  public static void skrivUt(double[] tabell) {
    for (double i : tabell) {
      System.out.print(i + " ");
    }
  }

}