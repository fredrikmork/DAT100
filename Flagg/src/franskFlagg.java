import easygraphics.*;
import static java.lang.Integer.*;
	public class franskFlagg extends EasyGraphics {
	 
	  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	    launch(args);
	  }
	 
	  public void run() {
	    makeWindow("Det franske flagget");
	    
	    String tallTxt = getText("Skalering i prosent:");
	    int str = parseInt(tallTxt);
	    
	    int vanligBredde = 375, vanligHøyde = 85;
	    int bredde = vanligBredde*str/100;
	    int høyde =vanligHøyde*str/100;
	 
	    setColor(0, 0, 0); //Svart
	    fillRectangle(50, 50, bredde, høyde);
	    setColor(255, 0, 0);//gul
	    fillRectangle(50, 50+høyde, bredde, høyde);
	    setColor(255, 255, 0);//rød
	    fillRectangle(50, 50+2*høyde, bredde, høyde);
	    setColor(0, 0, 0); //svart
	    drawRectangle(50, 50, bredde, høyde);
	   
	  }
	 
	}

