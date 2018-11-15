package no.hvl.dat100;

public class Square {
  
  //Objectvariable
  private int sideLength;
  
  //Constructors
  public Square() {
    sideLength = 0;
  }
  
  public Square(int sideLength) {
     this.sideLength = sideLength;
  }
  
  //Objectmethods
  public int areal() {
    return ( sideLength * sideLength );
  }
  
  public int circumference() {
    return ( sideLength * 4 - 4 );
  }
  
  public int diagonal() {
    return sideLength;
  }
  
  //Printing out the text
  public String toText() {
    
    return "Areal: " + areal()
        + "\nCircumference: " + circumference()
        + "\nDiagonal: " + diagonal();
  }
  
  //Printing out the stars
  public String toStar() {
    
    String star ="";
    
    for(int i = 0; i < sideLength; i++) {
      
      for(int j = 0; j < sideLength; j++) {
        star += "* "; 
      }
      star += "\n";
    }
    return star;
  }
  
  public boolean sum(Square sq3, Square sq4) {
    if(sq3.areal() + sq4.areal() == areal()) {
      return true;
      
    } else {
      return false;
      
    }
  }
}
