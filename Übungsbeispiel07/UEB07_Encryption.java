/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Encryption/Decryption Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.07>
*/



public class UEB07_Encryption {

	public static String crypt(String inputString, int rotation, int cryptoperator) {

		char[][] range = new char[][] { { 'a', 'z' }, { 'A', 'Z' }, { '0', '9' }, };
		int length = inputString.length();
		String returnString = "";

		for (int i = 0; i < length; i++) {
			char charInput = inputString.charAt(i);
			for (int j = 0; j < range.length; j++) {
				int rangeLength = range[j][1] - range[j][0] + 1;
				
				if (charInput >= range[j][0] && charInput <= range[j][1]) {
					int modulator = (rotation % rangeLength) * cryptoperator;
				
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
