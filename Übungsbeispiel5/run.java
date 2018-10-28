
/*
* <       >
* 6. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.18>
*/

import java.util.Scanner;

public class run {
	static int rectangleAmount = 1; // TODO Durchzählen über jedes erfolgreich eigegebene Dreieck
	static int circleAmount = 1;// TODO Durchzählen über jedes erfolgreich eigegebenes Dreieck

	public static void main(String[] args) {
		java.util.Locale.setDefault(new java.util.Locale("en", "US"));

		int offset = 2;
		int menuNumber;
		boolean quit = true;

		Scanner scan = new Scanner(System.in);
		String[][] menuEntries = new String[3][];
		menuEntries[0] = new String[] { "quit", "\"Quit\" - quit program" };
		menuEntries[1] = new String[] { "new circle", "\"New circle\" - create new circle" };
		menuEntries[2] = new String[] { "new rectangle", "\"New rectangle\" - create new rectangle" };

		while (quit) {

			menuNumber = menuMain(scan, menuEntries, offset);
//			System.out.println("MenüNummer : " + menuNumber);

			/*
			 * Case an Rückgabewerte des Stringarrays anpassen. Fals menü Größer werden soll
			 * 
			 */
			switch (menuNumber) {
			case 0: {
				quit = false;
				break;
			}
			case 1: {
				menuNewCircle(scan, offset);
				break;
			}
			case 2: {
				menuNewRectangle(scan, offset);
				break;
			}

			}

		}

	}

	/*
	 * Main Menü Methode wenn 0 Zurückgegeben wird dann break while
	 * 
	 */

	public static int menuMain(Scanner scan, String[][] menuEntries, int offset) {
		int lengthLineSeperator = 80;
		String inputValue;

		while (true) {

			System.out.println("-".repeat(lengthLineSeperator));
			System.out.println("Available commands:");
			for (int i = menuEntries.length - 1; i >= 0; i--) {

				System.out.println(" ".repeat(offset) + menuEntries[i][1]);
			}
			System.out.println("-".repeat(lengthLineSeperator));
			System.out.print("> ");


			inputValue = scan.nextLine();
			
			if (inputValue.isEmpty()) {
				inputValue = scan.nextLine();
			}

			inputValue = inputValue.toLowerCase();

			for (int i = 0; i < menuEntries.length; i++) {

				if (inputValue.equals(menuEntries[i][0].toLowerCase())) {
					return i;

				}

			}

		}

	}

	public static void menuNewCircle(Scanner scan, int offset) {

		int valueX = 0;
		int valueY = 0;
		int valueRadius = 0;

		while (true) {

			System.out.printf("Circle #%d:\n", circleAmount);//

			while (true) {
				System.out.print(" ".repeat(offset) + "Center: x coordinate: ");
				if (scan.hasNextInt()) {
					valueX = scan.nextInt();
					break;
				} else {
					scan.next();

				}
				;
			}

			while (true) {
				System.out.print(" ".repeat(offset) + "Center: y coordinate: ");
				if (scan.hasNextInt()) {
					valueY = scan.nextInt();
					break;
				} else {
					scan.next();

				}
			}

			while (true) {
				System.out.print(" ".repeat(offset) + "Radius: ");
				if (scan.hasNextInt()) {
					valueRadius = scan.nextInt();
					if (valueRadius >= 0) {
						break;

					}
				} else {
					scan.next();

				}

			}

			Point circleP = new Point(valueX, valueY);
			Circle circleC = new Circle(circleP, valueRadius);

			System.out.printf(" ".repeat(offset) + "Center: (%d,%d)\n", valueX, valueY);
			System.out.printf(" ".repeat(offset) + "Radius: %d\n", valueRadius);
			System.out.printf(" ".repeat(offset) + "Area:   %.2f\n", circleC.areaCircle());
			circleAmount++;
			if (circleC.validCircle() == false) {
				break;
			}
			circleC.drawCircle(offset, 0);
			break;

		}

	}

	public static void menuNewRectangle(Scanner scan, int offset) {

		int value1X;
		int value1Y;
		int value2X;
		int value2Y;

		while (true) {

			System.out.printf("Rectangle #%d:\n", rectangleAmount);

			while (true) {
				System.out.printf(" ".repeat(offset) + "First point:  x coordinate: ");
				if (scan.hasNextInt()) {
					value1X = scan.nextInt();
					break;
				} else {
					scan.next();

				}
			}
			while (true) {
				System.out.printf(" ".repeat(offset) + "First point:  y coordinate: ");
				if (scan.hasNextInt()) {
					value1Y = scan.nextInt();
					break;
				} else {
					scan.next();

				}
			}
			while (true) {
				System.out.printf(" ".repeat(offset) + "Second point: x coordinate: ");
				if (scan.hasNextInt()) {
					value2X = scan.nextInt();
					break;
				} else {
					scan.next();

				}
			}
			while (true) {
				System.out.printf(" ".repeat(offset) + "Second point: y coordinate: ");
				if (scan.hasNextInt()) {
					value2Y = scan.nextInt();
					break;
				} else {
					scan.next();

				}
			}

			Point point1 = new Point(value1X, value1Y);
			Point point2 = new Point(value2X, value2Y);
			Rectangle rectangle = new Rectangle(point1, point2);

			System.out.printf(" ".repeat(offset) + "Width:  %d\n", rectangle.widthRectangle());
			System.out.printf(" ".repeat(offset) + "Height: %d\n", rectangle.heightRectangle());
			System.out.printf(" ".repeat(offset) + "Area:   %d\n", rectangle.areaRectangle());
			rectangleAmount++;
			if (rectangle.validRectangle() == false) {
				break;
			}
			rectangle.drawRectangle(offset, 0);

			break;

		}

	}

}
