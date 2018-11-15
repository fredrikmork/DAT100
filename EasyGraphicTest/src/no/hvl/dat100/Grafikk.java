package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics{
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run()	{
		makeWindow("Grafikk", 350, 300);
		drawCircle(150, 70, 60);
		drawCircle(150, 210, 80);
	}

}
