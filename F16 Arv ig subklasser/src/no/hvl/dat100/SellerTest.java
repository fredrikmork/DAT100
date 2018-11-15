package no.hvl.dat100;
import static java.lang.System.*;
public class SellerTest {

  public static void main(String[] args) {
    Seller s1 = new Seller(5, "Arne-Jarle", "Nilsen", 4000000, 200000);
    out.println(s1.toString());
    s1.setFirstname("Arne");
    out.println(s1);
    
    Employee e1 = new Seller(1, "Gøril", "Martin", 341, 34);
    out.println(e1.getSalary());
    
    Employee[] eTab = new Employee[3];
    eTab[0] = s1;
    eTab[1] = e1;
    eTab[2] = new Seller(2, "Rolf-Knut","Langås",1, -1);
    
    for(Employee e:eTab) {
      out.println(e.toString());
    }
    //Total salary
    double tot = 0.0;
    for(Employee e:eTab) {
      tot += e.getSalary();
      if(e.getSalary() >= 500000)
        out.println("Vedkommende tjener caaaash: "+e);
        
    }
    out.println("Total lønn blir: " + tot);
  }

}