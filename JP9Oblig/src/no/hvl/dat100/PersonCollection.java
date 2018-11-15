package no.hvl.dat100;

public class PersonCollection {
  private Person [] personList;
  private int nextAvailable;
  
  //Standars
  public PersonCollection() {
    this(20); //default
  }
  public PersonCollection(int number) {
    super(); 
    personList = new Person[number];
    nextAvailable = 0;
  }
  
  //Objectmethods
  public void add(Person p) {
    personList[nextAvailable] = p;
    nextAvailable++;
  }
  public int getCount() {
    return nextAvailable;
  }
  //finds the position of a person-objekt given NID, returns -1 else.
  private int findPerson(int nID) {
    boolean found = false;
    int position = 0;
    while(position < nextAvailable && !found) {
      if(personList[position].getNationalIdentity() == nID) {
        found = true;
      } else {
        position++;
      }
    }
    if(found) {
      return position;
    } else {
      return -1;
    }
  }
  //return value true if a person is found
  
  //Getters&Setters
  public Person[] getPersons() {
    return personList;
  }
  public void setPersons(Person[] personList) {
    this.personList = personList;
  }
  public int getNextAvailable() {
    return nextAvailable;
  }
  public void setNextAvailable(int nextAvailable) {
    this.nextAvailable = nextAvailable;
  }
}
