package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
//Bytte verdier på x, y og z på en sirkulær måte. Slik at y får startverdien til x, z får startverdien til y, og x får startverdien til z.
public class bytteVariabler {
	
	public static void main(String[]args) {
		//Innlesing
		String tallTxt = showInputDialog("Oppgi en verdi");
		int x = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi en ny verdi");
		int y = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi en ny verdi");
		int z = parseInt(tallTxt);
		String utTxt = "x " + x + "\n" + "y " + y + "\n" + "z" + z;
		//Bytting
		int tempy = x;
		int tempx = z;
		int tempz = y;
		y = tempy;  //y får verdien til x
		z = tempz;  //z får verdien til y
		x = tempx;  //x får verdien til z
		
        //Utskrift
		utTxt = "x " + x + "\n" + "y " + y + "\n" + "z " + z + "\ny=x \nz=y \nx=z";
	    showMessageDialog(null,utTxt);		
	}
}
