package src;
/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Encryption/Decryption Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.09>
*/



public class Encryption {
	
	/*
	 * Crypt, Decrypt Methode for Cesar Code
	 * use Int cryptOperator 1 for crypt mode, -1 for decrypt mode
	 * 
	 */
	public static String crypt(String inputString, int rotation, int cryptOperator) {

		/*
		 * use Char Array for the range of the characters witch you want to change
		 * only 2 columns are allowed for the char array range
		 */
		
		char[][] range = new char[][] { { 'a', 'z' }, { 'A', 'Z' }, { '0', '9' }, };
		int length = inputString.length();
		String returnString = "";

		for (int i = 0; i < length; i++) {
			char charInput = inputString.charAt(i);
			for (int j = 0; j < range.length; j++) {
				int rangeLength = range[j][1] - range[j][0] + 1;
				
				if (charInput >= range[j][0] && charInput <= range[j][1]) {
					int modulator = (rotation % rangeLength) * cryptOperator;
				
					if ((charInput - range[j][0] + modulator) < 0) {
						charInput = (char) (charInput + rangeLength + modulator);
					} else if ((range[j][1] - charInput) < modulator) {
						charInput = (char) (charInput - rangeLength + modulator);
					} else {
						charInput = (char) (charInput + modulator);
					}
				}
			}
			returnString += charInput;
		}
		return returnString;
	}

}
