package src;
/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Run Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.11>
* 
* - New Valid Input
* - Integrated Submenu in Main Method
* - New Method for Creating a String of the menuarray
* - New Method for valid Inputs for the submenu from the MenuArray
* 
*/

public class Run {
	static int OFFSET = 2;
	static int LENGTHLINESEPERATOR = 80;
	static ValidInput INPUT;
	static String SUBMENU;
	static int rowToBeValidated = 0;
	static int rowToBePrinted = 1;
	static String[][] MENUENTRIES = new String[3][];

	/*
	 * 
	 * Main Method for running
	 */
	public static void main(String[] args) {

		/*
		 * String Array for generating Menu Column 1: Validate input Column 2: Printed
		 * MenuItem menuentries must be in format {"text to enter", "text to print"}
		 * 
		 */
		MENUENTRIES[0] = new String[] { "9", "9 - Quit" };
		MENUENTRIES[1] = new String[] { "2", "2 - Decrypt text" };
		MENUENTRIES[2] = new String[] { "1", "1 - Encrypt text" };
		INPUT = new ValidInput();

		int rotation;
		String stringToEncrypt;
		String encryptedString;

		do {

			SUBMENU = INPUT.getValidString(getMainMenuAsString(), getMenuEntriesToBeValidated());
			switch (SUBMENU) {
			case "1":
				rotation = INPUT.getValidIntegerMin(" ".repeat(OFFSET) + "Enter rotation: ", 0);
				stringToEncrypt = INPUT.getNextStringWithOutput(" ".repeat(OFFSET) + "Enter text to encrypt: ");
				encryptedString = Encryption.crypt(stringToEncrypt, rotation, 1);
				System.out.println(" ".repeat(OFFSET) + "Encrypted text: " + encryptedString);
				continue;

			case "2":
				rotation = INPUT.getValidIntegerMin(" ".repeat(OFFSET) + "Enter rotation: ", 0);
				stringToEncrypt = INPUT.getNextStringWithOutput(" ".repeat(OFFSET) + "Enter text to decrypt: ");
				encryptedString = Encryption.crypt(stringToEncrypt, rotation, -1);
				System.out.println(" ".repeat(OFFSET) + "Decrypted text: " + encryptedString);
				continue;
		
			}

		} while (!SUBMENU.equals("9"));

	}

	
	
	
	/*
	 * Converts the String array into Printable String with LineSeperator and
	 * printable Menu Entries
	 */
	public static String getMainMenuAsString() {
		String menuString = "";

		menuString += "-".repeat(LENGTHLINESEPERATOR) + "\n";
		for (int i = MENUENTRIES.length - 1; i >= 0; --i) {

			menuString += MENUENTRIES[i][rowToBePrinted] + "\n";
		}
		menuString += "-".repeat(LENGTHLINESEPERATOR) + "\n";
		menuString += "> ";

		return menuString;
	}

	/*
	 * Give back the toBeValidated Strings for Submenu Entries
	 */
	public static String[] getMenuEntriesToBeValidated() {
		String[] toBeValidated = new String[MENUENTRIES.length];

		for (int i = 0; i < MENUENTRIES.length; i++) {
			toBeValidated[i] = MENUENTRIES[i][rowToBeValidated];
		}

		return toBeValidated;
	}

}
