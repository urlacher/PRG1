/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Run Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.07>
*/



public class UEB07_Run {
	static int OFFSET = 2;
	static int LENGTHLINESEPERATOR = 80;
	static UEB07_ValidInput INPUT;
	static int SUBMENU;

	static String[][] MENUENTRIES = new String[3][];

	/*
	 * 
	 * Main Method for running
	 */
	public static void main(String[] args) {

		/*
		 * String Array for generating Menu Column 1: Validate input Column 2: Printed
		 * MenuItem
		 */
		MENUENTRIES[0] = new String[] { "9", "9 - Quit" };
		MENUENTRIES[1] = new String[] { "2", "2 - Decrypt text" };
		MENUENTRIES[2] = new String[] { "1", "1 - Encrypt text" };

		INPUT = new UEB07_ValidInput();

		do {
			printMenuMain();
			if (INPUT.verifyNextInt() == true) {
				SUBMENU = INPUT.getValidNextInt();
				subMenu();
			}

		} while (SUBMENU != 9);

	}

	public static void printMenuMain() {
		System.out.println("-".repeat(LENGTHLINESEPERATOR));
		for (int i = MENUENTRIES.length - 1; i >= 0; i--) {

			System.out.println(MENUENTRIES[i][1]);
		}
		System.out.println("-".repeat(LENGTHLINESEPERATOR));
		System.out.print("> ");
	}

	public static void subMenu() {

		/*
		 * Case if returnvalue of stringarray do submenu
		 * 
		 */
		switch (SUBMENU) {
		case 9: {

			break;
		}
		case 1: {
			int rotation;
			String encryptedString;

			while (true) {
				System.out.print(" ".repeat(OFFSET) + "Enter rotation: ");
				if (INPUT.verifyNextIntGreater(-1)) {
					rotation = INPUT.getValidNextInt();
					break;
				}

			}

			while (true) {
				System.out.print(" ".repeat(OFFSET) + "Enter text to encrypt: ");
//				encryptedString = INPUT.getNextString();

				encryptedString = UEB07_Encryption.crypt(INPUT.getNextString(), rotation, 1);
				System.out.println(" ".repeat(OFFSET) + "Encrypted String: " + encryptedString);

				break;
			}

			break;
		}
		case 2: {
			
			int rotation;
			String encryptedString;
			
			while (true) {
				System.out.print(" ".repeat(OFFSET) + "Enter rotation: ");
				if (INPUT.verifyNextIntGreater(-1)) {
					rotation = INPUT.getValidNextInt();
					break;
				}
				
			}
			
			while (true) {
				System.out.print(" ".repeat(OFFSET) + "Enter text to decrypt: ");
//				encryptedString = INPUT.getNextString();
				
				encryptedString = UEB07_Encryption.crypt(INPUT.getNextString(), rotation, -1);
				System.out.println(" ".repeat(OFFSET) + "Decrypted Text: " + encryptedString);
				
				break;
			}

			break;
		}

		}
	}

}
