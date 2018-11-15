package no.hvl.dat100;
import static java.lang.System.*;
public class ClientName {
  public static void main(String[]args) {
    Name n1 = new Name("fRedRik", "mØrk");
    Name n2 = new Name("simen", "gJerDe");
    out.println(n1.toString());
    out.println(n2.toString());
  }
}