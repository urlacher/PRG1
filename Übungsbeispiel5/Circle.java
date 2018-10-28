/*
* <2018.10.18 - Übungen>
* 6. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.18>
*/
public class Circle {

	private static int amount;
	private int pointX;
	private int pointY;
	private int radius;
	private double area;
	private boolean validCircle;

	public Circle(Point xy1, int radius) {
		super();
		this.pointX = xy1.getPointx();
		this.pointY = xy1.getPointy();
		this.radius = radius;
		this.area = areaCircle();
		this.validCircle = radius == 0 ? false : true;
	}


	
	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public double areaCircle() {
		
		area = Math.PI * radius * radius;
		
		return area;

	}
	
	public boolean validCircle() {
		return validCircle;
		
	}
	
	public void drawCircle(int xOffset, int yOffset) {

		int drawRadiusHeight = radius;
		int drawRadiusWidth = radius * 2;
		
		if (radius <= 0) {
//			System.out.println("Keine Kreis");;
		} else {
			
		
		System.out.println(" ".repeat(xOffset) + " " + " ".repeat(drawRadiusWidth) + "--"); //Ausgabe 1. Zeile
		for (int i=0; i<drawRadiusHeight;i++) {
			System.out.println("");
		}
		System.out.println(" ".repeat(xOffset) + "|" + " ".repeat(drawRadiusWidth) + "::" + " ".repeat(drawRadiusWidth) + "|"); //Ausgabe Mittelpunktzeile
		
		for (int i=0; i<drawRadiusHeight;i++) {
			System.out.println("");
		}
		System.out.println(" ".repeat(xOffset) + " " + " ".repeat(drawRadiusWidth) + "--"); //Ausgabe letzte Zeile
		
		}
		
	}

	public static int returnAmount() {
		return amount;
	}

}
