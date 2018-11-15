public class oppg2GrOp {

  public static void main(String[] args) {

    System.out.println("Del 1");

    int i = 1;
    while (i < 1) {

      System.out.println("Nr 1, i = " + i);

    }
    //

    System.out.println("Del 2");
    for (int j = 1; j < 8; j = j * 2) {
      System.out.println("Nr 2, j = " + j);

    }
    //j=1,2,4
    System.out.println("Del 3");
    String s = "Test";

    for (int k = s.length() - 1; k > 0; k = k - 1) {
      System.out.println("Nr 3, k = " + s.charAt(k));

    }
    //s.charAt(k)= 3,2,1,0 --> t,s,e
    System.out.println("Del 4");
    int tall = 7569;
    int hjelp = tall;

    int aS = 0;

    do {

      hjelp = hjelp / 10; //756

      aS = aS + 1;//1++

    } while (hjelp > 0);

    System.out.println(tall + " <fyll inn> " + aS + " <fyll inn>");

  }
    //7569 <fyll inn> 4 <fyll inn>
}