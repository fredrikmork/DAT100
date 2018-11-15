package no.hvl.dat100O1;

public class Oppgave1 {
//20
//-5
//false
//true
//false

//  a = 4
//  a = 14
//  a = 24
//  a = -24
  
  enum E { A, B, C };
  private E a = E.A;
  public static void metodeC(int x, int y) {
  E a;
  if (x < y) {
  a = E.A;
  } else if (x > y) {
  a = E.C;
  } else {
  a = E.B;
  }
  System.out.println("a = " + a);
  }
 
  //0 1 
  // -1
  // x = 2
//  metodeD1(0)
//  metodeD1(1)
//  metodeD1(-1)
  //metodeD1
  public static void metodeD1(int x) {
    if (x < 0) {
    throw new ArithmeticException("X er negativ");
    } else {
    System.out.print(x + " ");
    }
    }
    public static void metodeD2() {
    int[] tab = { 0, 1, -1, 2, 3 };
    int x = 0;
    try {
    for (int i = 0; i < tab.length; i++) {
    x = i;
    metodeD1(tab[i]);
    }
    } catch (ArithmeticException exception) {
    System.out.println();
    System.out.println(tab[x]);
    } finally {
    System.out.println("x = " + x);
    }
    }
    //Første i main maetoden, må være int
    // man skal returnere en int og ikke en boolsk verdi.
    public static int metodeC(int x) {
      boolean b = true;
      String s = "";
      double[] dtab = {0.0,15.4};
      double d;
      while (b && x>0) {
      x = x - 1;
      d = dtab[2];
      s.concat(Integer.toString(x));
      }
      return (x);
      }
      public static void main(String[] args) {
      metodeC(1);
      }
}
