package no.hvl.dat100;

public class TestSamling {
  public static void main (String[]args) {
    Objektsamling s = new Objektsamling(10);
    Objektsamling books = new Objektsamling(5);
    Bok b3 = new Bok();
    books.place(b3);
  }

}
