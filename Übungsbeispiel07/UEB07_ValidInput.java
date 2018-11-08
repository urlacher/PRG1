/*
* <2018.11.07 - Uebungsbeispiel 7>
* 7. Uebungsbeispiel Scanner and Validating input Class
* Author: <Thomas Urlacher>
* Last Change: <2018.11.07>
*/



import java.util.Scanner;

public class UEB07_ValidInput {
	Scanner scan;
	Boolean verifyedNextInt = false;
	int NextInt;
	String returnString;

	public UEB07_ValidInput() {
		this.scan = new Scanner(System.in);

	}

	public String getNextString() {
		
		this.scan.hasNext();
		returnString = this.scan.nextLine();

		return returnString;

	}

	
	
	
	
	public int getValidNextInt() {
		
		return NextInt;
		
	}

	public boolean verifyNextInt() {

		
	
		if (this.scan.hasNextInt()) {
			this.NextInt = this.scan.nextInt();
			
			String restOfString = this.scan.nextLine();
			
			if(restOfString.length()>0) {
				System.out.println("Rest String also verwerfen!!!! : " + restOfString);
				this.NextInt = 0;
				return false;
			}
			
			this.verifyedNextInt = true;
			return verifyedNextInt;
		} else {
			this.scan.nextLine();
			return false;
		}

	}

	
	public boolean verifyNextIntGreater(int min) {
		
		if (!this.scan.hasNextInt()) {
			this.scan.nextLine();
			return false;
		}
		
		this.NextInt = this.scan.nextInt();
		this.scan.nextLine();
		if(this.NextInt>min) {
			this.verifyedNextInt = true;
			return verifyedNextInt;
			
		}
		return false;
	}
	

}
