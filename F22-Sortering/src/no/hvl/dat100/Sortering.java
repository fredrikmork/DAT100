package no.hvl.dat100;

public class Sortering {
 
  
  public static void plukkSortering(int [] tab) {
    int n = tab.length;
    for(int i = 0;i < n - 1; i++) {
      int minPos = i;
      for(int j = i + 1;j < n; j++) {
        if(tab[j] < tab[minPos]) {
          minPos = j;
        }
      }
       int temp = tab[i];
       tab[i] = tab[minPos];
       tab[minPos] = temp;
    }
  }
  public static void main(String[]args) {
    int [] tabell = { 8, 9, 6, 4, 2, 6, 4, 6, 4, 7, 43, 325, 2, 235, 643, 2, 46, 2, 64, 642, 364, 64, 64, 2, 
        46, 2446 , 2464 , 264642, 624642, 6246, 46, 3};
    plukkSortering(tabell);
    for (int e : tabell) {
      System.out.print(e + " ");
    }
    System.out.println();
  }

}
