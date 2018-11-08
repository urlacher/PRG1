/*
* <2018.10.18 - Übungen>
* 6. Übungsbeispiel - Class for Rectangles
* Author: <Thomas Urlacher>
* Last Change: <2018.10.31>
*/

class Rectangle {

	private Point point1;
	private Point point2;
	private static int amount;
	private int valueWidthRectangle;
	private int valueHeightRectangle;
	private int areaRectangle;
	private boolean validRectangle;

	/*
	 * Construktor for Rectangles
	 * 
	 */

	public Rectangle(Point xy1, Point xy2) {
		super();
		this.point1 = xy1;
		this.point2 = xy2;
		valueWidthRectangle = 
		
//		System.out.println();

		amount++;
	}

	/*
	 * Returns the width of the Rectangle
	 */
	public int widthRectangle() {
		
//		this.valueWidthRectangle = point1.getPointx() - point2.getPointx();

		
 
		if (point1.getPointx() < point2.getPointx()) {
			this.valueWidthRectangle = point2.getPointx() - point1.getPointx();			
		} else {
			this.valueWidthRectangle = point1.getPointx() - point2.getPointx();			
		}

		return valueWidthRectangle;

	}

	/*
	 * Returns the height of the Rectangle
	 */
	public int heightRectangle() {


		this.valueHeightRectangle = point1.getPointy() < point2.getPointy() ? point2.getPointy() - point1.getPointy() : point1.getPointy() - point2.getPointy();
		return valueHeightRectangle;

	}

	/*
	 * Returns the area of the Rectangle
	 */
	public int areaRectangle() {

		areaRectangle = valueHeightRectangle * valueWidthRectangle;
		return areaRectangle;

	}

	/*
	 * Returns a boolean if the Rectangle is valid for drawing
	 */
	public boolean validRectangle() {
		this.validRectangle = valueWidthRectangle == 0 || valueHeightRectangle == 0 ? false : true;
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

		while (countLine <= drawHeight) {

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
