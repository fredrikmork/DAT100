package no.hvl.dat100;

public class Ansatt implements Element{
    //Objectvariables
    private int nr;
    private String firstname;
    private String surname;
    private double salary;
    //standard constructur
    public Ansatt() {
      nr = 0;
      firstname = "";
      surname = "";
      salary = 0.0;
    }
    //Constructor
    public Ansatt (int nr,String firstname, String surname, double salary ) {
      this.nr = nr;
      this.firstname = firstname;
      this.surname = surname;
      this.salary = salary;
    }
    @Override
    public String key() {
      return Integer.toString(nr);
    }
    //Getters & setters (Objectmethods)
    public int getNr() {
      return nr;
    }
    public void setNr(int nr) {
      this.nr = nr;
    }
    public String getFirstname() {
      return firstname;
    }
    public void setFirstname(String fn) {
      firstname = fn;
    }
    public String getSurname() {
      return surname;
    }
    public void setSurname(String sn) {
      surname = sn;
    }
    public double getSalary() {
      return salary;
    }
    public void setSalary(double salary) {
      this.salary = salary;
    }
    @Override
    public String toString() {
      return nr + " " + firstname + " " + surname + " Lønn: " + salary;
    }
}
