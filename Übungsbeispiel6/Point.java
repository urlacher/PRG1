/*
* <2018.10.18 - Übungen>
* 6. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.18>
*/

class Point {

	private int pointx;
	private int pointy;
	
	public Point () {
		System.out.println("Nix übergeben");
	}

	public Point(int pointx, int pointy) {
		super();
		this.pointx = pointx;
		this.pointy = pointy;
	}

	public int getPointx() {
		return pointx;
	}

	public void setPointx(int pointx) {
		this.pointx = pointx;
	}

	public int getPointy() {
		return pointy;
	}

	public void setPointy(int pointy) {
		this.pointy = pointy;
	}
	
	
	/*
	 * Returns the minimum of 2 integers
	 */
	public static int valueMin(int value1, int value2) {

		if (value1 < value2) {
			return value1;
		}
		return value2;
	}

	/*
	 * Returns the maximum of 2 integers
	 */
	public static int valueMax(int value1, int value2) {

		if (value1 > value2) {
			return value1;
		}
		return value2;
	}
	
	

}
