package no.hvl.dat100;

public class eivin {

  public static void main(String[] args) {
    double [] vinkelG = {0, 15, 30, 45, 60, 75, 90, 105, 120, 135, 150, 165, 180};
    double [] vinkelR = new double [vinkelG.length];
    
    for(int j = 0; j <= vinkelG.length; j++) {
      System.out.print("x i grader");
      System.out.println("\t\t" + vinkelG[j]);
      }
    
    for(int i = 0; i <= vinkelG.length; i++) {
      vinkelR[i] = vinkelG[i]*(Math.PI)/180;  
    
      System.out.println("x i radianer for " + vinkelG[i] + " grader" + "\t\t = " + vinkelR[i]);

  }
  }
}
