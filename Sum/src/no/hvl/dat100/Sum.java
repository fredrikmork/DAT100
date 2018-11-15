package no.hvl.dat100;
public class Sum {
  public static void main(String[] args) {
    // summere 1+2...+10=55

    // for-løkke
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
      System.out.println(i);
    }
    System.out.println("Summen er: " + sum);
    
    // While-løkke
    int sum2=0;
    int teller = 0;
    while (teller <= 10) {
      sum2 = sum2 + teller;
      teller = teller + 1;
    }
    System.out.println("Summen er: " + sum2);
  }
}