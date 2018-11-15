package no.hvl.dat100;

public class Løsning1 {
//  public static void oppgave1a() {
//
//    int x = 4;
//    int y = 10;
//
//    System.out.println(x * 4 + y * 3); // precedens
//
//    System.out.println("x * y = " + x * y);
//
//    System.out.println(x != y);
//
//    String s = "dat100";
//    System.out.println(s.substring(1, 3).equals("dat")); // [1..3[
//  }
//
//  public static void main(String[] args) {
//
//    oppgave1a();
//
//  }
//  //opg1b
//  public static int cmp(int x, int y) {
//
//    int v;
//    if (x > y) {
//      v = 1;
//    } else if (x < y) {
//      v = -1;
//    } else {
//      v = 0;
//    }
//
//    return v;
//  }
//
//  public static void main(String[] args) {
//
//    int a = 42;
//    int z = cmp(a, 31);
//    System.out.println(z);
//  }
  //opg1c
//  public static void oppgave1c() {
//
//    int[] tab = { 1, 2, 3, 4, 5, 6 };
//    
//    for (int i = 0; i < tab.length; i++) {
//      if (i % 2 != 0) {
//        System.out.println(i);
//      }
//    }
//  }
//
//  public static void main(String[] args) {
//    
//    oppgave1c();
//
//  }
  //d
  public static void a(int x) {

    try {
      b(x - 5);
    } catch (Exception exn) {
      System.out.println("C");
    }
  }

  public static void b(int x) throws Exception {

    System.out.println("D");

    if (x == 0) {
      throw new Exception("E");
    } else {
      System.out.println("F");
    }
  }

  public static void main(String[] args) {
    System.out.println("A");

    a(5);

    System.out.println("B");

  }
  /* e
   * sjekkede unntak - må håndteres eller videreformidles via throws. 
   * Subklasser av Exception som ikke er subklasser av RunTimeException
   * Ofte pga. ekterns hendelser
   *
   * usjekkede unntak - subklasser av RunTimeException. Ikke noe krav at de håndteres 
   * eller videreformidles.
   * Signalerer i hovedsak programmeingsfeil.
   * 
   */
}
