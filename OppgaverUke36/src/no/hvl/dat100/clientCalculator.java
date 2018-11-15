package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class clientCalculator {
  
  public static void main(String[]args) {
    
    String numberTxt = showInputDialog("Write the first integer");
    int number = parseInt(numberTxt);
    numberTxt = showInputDialog("Write the second integer");
    int number2 =parseInt(numberTxt);
    
    showMessageDialog(null,"Addisjonene blir " + calculator.add(number, number2));
    
  }

}
