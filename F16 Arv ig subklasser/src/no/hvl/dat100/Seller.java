package no.hvl.dat100;

public class Seller extends Employee{
  private double bonus;
  //Standard-construtor
  public Seller() {
    super();
    bonus = 0.0;
  }
  //Constructor
  public Seller(int nr, String firstname, String surname, double salary, double bonus) {
    super(nr, firstname, surname, salary);
    this.bonus = bonus;
  }
  //Getters&Setters
  public double getBonus() {
    return bonus;
  }
  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
  //Override-objectmethods
  @Override
  public double getSalary() {
    return salary + bonus; //super.getSalary() hvis den ikke er protected
  }
  
  @Override
  public String toString() {
    return super.toString() + " Bonus: " + bonus;
  }
}
