
/*
* <2018.10.18 - Übungen>
* 6. Übungsbeispiel - Class for generating Circles
* Author: <Thomas Urlacher>
* Last Change: <2018.10.31>
*/
class Circle {

	private static int amount;
	private Point Point1;
	private int radius;
	private double area;
	private boolean validCircle;
	

	/*
	 * Constructor for Circle, setting validCircle, calculating 
	 * 
	 */
	public Circle(Point xy1, int radius) {
		super();
		this.Point1 = xy1;
		this.radius = radius;
		++amount;
	}
	
	/*
	 * getter for Radius 
	 * 
	 */
	public int getRadius() {
		return radius;
	}



	/*
	 * setter for Radius 
	 * 
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}



	/*
	 * returns the area of the Circle
	 * 
	 */
	public double areaCircle() {
		
		area = Math.PI * radius * radius;
		
		return area;

	}
	
	
	/*
	 * returns a boolean if the circle is valid for drawing
	 * 
	 */
	public boolean validCircle() {
		this.validCircle = radius == 0 ? false : true;
		return validCircle;
		
	}
	
	/*
	 * draws the circle, 
	 * 
	 */
	public void drawCircle(int xOffset, int yOffset) {

		int drawRadiusHeight = radius;
		int drawRadiusWidth = radius * 2;
		
		if (radius <= 0) {
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
