/*
* <2018.10.18 - Übungen>
* 6. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.18>
*/


class Rectangle {

	private int valueXMin;
	private int valueXMax;
	private int valueYMin;
	private int valueYMax;
	private static int amount;
	private int valueWidthRectangle;
	private int valueHeightRectangle;
	private int areaRectangle;
	private boolean validRectangle;

	public Rectangle(Point xy1, Point xy2) {
		super();
		this.valueXMin = Point.valueMin(xy1.getPointx(), xy2.getPointx());
		this.valueXMax = Point.valueMax(xy1.getPointx(), xy2.getPointx());
		this.valueYMin = Point.valueMin(xy1.getPointy(), xy2.getPointy());
		this.valueYMax = Point.valueMax(xy1.getPointy(), xy2.getPointy());
		this.valueWidthRectangle = widthRectangle();
		this.valueHeightRectangle = heightRectangle();
		this.areaRectangle = valueHeightRectangle * valueWidthRectangle;
		this.validRectangle = valueWidthRectangle == 0 || valueHeightRectangle == 0 ? false : true ;
		
		amount++;
	}

	public int widthRectangle() {

		valueWidthRectangle = valueXMax - valueXMin;
		return valueWidthRectangle;

	}

	public int heightRectangle() {

		valueHeightRectangle = valueYMax - valueYMin;
		return valueHeightRectangle;

	}

	public int areaRectangle() {
		
		return areaRectangle;
		
	}
	
	public boolean validRectangle() {
		return validRectangle;
		
	}
	
	

	/*
	 * Printout the Rectangle on your Console use the Offset of run Method
	 */

	public void drawRectangle(int xOffset, int yOffset) {

		int countLine = 1;

		int drawWidth = valueWidthRectangle * 2;
		int drawHeight = valueHeightRectangle + 2;

		/*
		 * Erste Zeile Durchlaufen und Leerschritt ausgeben
		 */

		while (countLine <= drawHeight ) {

			if (countLine == 1 || countLine == drawHeight) {

				System.out.print(" ".repeat(xOffset));
				System.out.print(" ");
				System.out.print("-".repeat(drawWidth));

			} else {

				System.out.print(" ".repeat(xOffset));
				System.out.print("|");
				System.out.print(" ".repeat(drawWidth));
				System.out.print("|");

			}
			System.out.println();
			countLine++;

		}

	}

	/*
	 * Return the amount of Rectangles
	 */

	public static int returnAmount() {
		return amount;
	}

}
