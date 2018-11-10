package src;
/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Scanner and Validating input Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.11>
* 
* - New Method for Printing String and getting back Valid Inputs of Strings
* - New Method for Printing String and getting back Valid Integers
* - New Method for Printing String and getting back String Input
*/

import java.util.Scanner;

public class ValidInput {
	Scanner scan;


	int nextInt;
	String returnString;

	/*
	 * Construktor for new scanner
	 */
	public ValidInput() {
		this.scan = new Scanner(System.in);

	}

	
	/*
	 * Print String, Validates with tuBeValidated until correct input
	 */
	public String getValidString(String output, String[] toBeValidated) {
		String nextString = "";

		while (true) {

			System.out.print(output);
			nextString = getNextString();

			for (String elementToBeValidated : toBeValidated) {
				if (!nextString.equals(elementToBeValidated))
					continue;
				return nextString;

			}

		}
	}

	
	/*
	 * Get the next String whithout Validation even when only Enter is entered
	 */
	public String getNextString() {
		returnString = this.scan.nextLine();
		return returnString;
	}

	
	/*
	 * Get next String with printing the output an looping till a string is entered
	 */
	public String getNextStringWithOutput(String output) {

		while (true) {
			System.out.print(output);
			getNextString();
			if (returnString.length() != 0)
				return returnString;
		}

	}

	
	/*
	 * Get next validated Integer. Only Integers are allowed. "11 abc" is not valid
	 */
	public int getValidInteger(String output) {

		while (true) {

			System.out.print(output);

			if (!this.scan.hasNextInt()) {
				this.scan.nextLine();
				continue;
			}

			nextInt = this.scan.nextInt();
			if (this.scan.nextLine().length() == 0) {
				return nextInt;
			}

		}

	}

	
	
	/*
	 * Get next validated Integer. Only Integers are allowed. "11 abc" is not valid Greater than Min
	 */
	public int getValidIntegerMin(String output, int min) {
		
		while (true) {
			
			System.out.print(output);
			
			if (!this.scan.hasNextInt()) {
				this.scan.nextLine();
				continue;
			}
			
			nextInt = this.scan.nextInt();
			if(nextInt <= min) {
				this.scan.nextLine();
				continue;
			}
			
			if (this.scan.nextLine().length() == 0) {
				return nextInt;
			}
			
		}
		
	}

}
