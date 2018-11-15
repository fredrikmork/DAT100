package no.hvl.dat100;

import static java.lang.System.out;

public class TestPerson {

  public static void main(String[] args) {
    PersonCollection collection = new PersonCollection();
    Person persons [] =  {
        new Teacher(12345678956L, "Fredrik", "ge", 2424, 2),
        new Student(12345678055L, "Sondre", "few", 2422, "1a")
        };
    //long nI, String sN, String fN, int mS, int aN)
    //long nI, String sN, String fN, int sn, String c1
    for(Person p:persons) { //itererer over en liste
      collection.add(p);
    }
    out.println(collection.getCount());
  }

}
