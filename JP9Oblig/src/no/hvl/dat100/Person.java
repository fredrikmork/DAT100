package no.hvl.dat100;
//Person
//o Objektvariabler
// fodselsnummer (long)
// etternamn (String)
// fornamn (String)
//o Konstruktører
// Standard konstruktør
// Konstruktør med tre parametre som kan gi verdi til alle objektvariablene
//o Metoder
// toString() som returnerer data i objektet som en streng, eks:
//"10100110700\nOlsen\nOle\n"
// erLik(Person p) som returnerer true hvis og kun hvis p har samme
//fødselsnummer som fodselsnummeret i objektvariablen fodselsnummer
// erKvinne() som returnerer true om tredjesiste siffer i fødselsnummer er et
//partall.
// erMann() som returnerer true om tredjesiste siffer i fødslesnummer er et
//oddetall.
import static java.lang.Integer.*;
public abstract class Person {
  private long nationalIdentity;
  private String surname;
  private String firstname;
  //Standard constructor
  public Person() {
    nationalIdentity = 0;
    surname = "";
    firstname = "";
  }
  //Constructor
  public Person(long nI, String sN, String fN) {
    nationalIdentity = nI;
    surname = sN;
    firstname = fN;
  }
  //ObjectMethods
  public boolean isEqual(Person p) {
    if(this.nationalIdentity == p.nationalIdentity) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isWoman(Person p) {
    int woman = 0;
    String ny = String.valueOf(nationalIdentity);
    woman = parseInt(ny.substring(8,9));
    if(woman % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isMan(Person p) {
    int man = 0;
    String ny = String.valueOf(nationalIdentity);
    man = parseInt(ny.substring(8,9));
    if(man % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
  //Getters & Setters
  public long getNationalIdentity() {
    return nationalIdentity;
  }
  public void setNationalIdentity(long nI) {
    nationalIdentity = nI;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String sN) {
    surname = sN;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String fN) {
    firstname = fN;
  }
  //toString
  @Override
  public String toString() {
    String print = nationalIdentity + "\n" + surname + "\n" + firstname;
    return print;
  }
}
