import java.util.Scanner;

/*
* <2018.10.17 - Übungen>
* 4. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.17>
*/
public class Uebungsbeispiel4 {

	public static void main(String[] args) {

		java.util.Locale.setDefault(new java.util.Locale("en", "US"));

		int amount = 0;
		int enteredValue = 0;
		int summe = 0;
		int min = 2147483647;
		int max = -2147483647;
		double mean = 0;
		double meanReciprocal = 0;
		double meanNegative = 0;
		double meanAbsolute = 0;
		int delta = 0;
		long sumMinMax = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		
		if (sc.hasNextInt()) {
			amount = sc.nextInt();
			// Go into while
		
			int count = 1;
			while (count <= amount) {
				System.out.print("#" + count + ": ");
			
				if (sc.hasNextInt()) {
					enteredValue = sc.nextInt();
					summe += enteredValue;
					if (enteredValue < min) {
						min = enteredValue;
					}

					if (enteredValue > max) {
						max = enteredValue;
					}
					count++;
				} else {
					sc.next();
				}
			}

			mean = summe * 1.0 / amount * 1.0; // Prof Fragen Warum wenn ich summe * 1.0 rechne richtiges ergebnis?
			meanReciprocal = 1 / mean;
			meanNegative = mean * -1;
			delta = max - min;
			meanAbsolute = (mean > 0) ? (meanAbsolute = mean) : (meanAbsolute = mean * -1);
			sumMinMax = (min + max) * (delta + 1) / 2;

			System.out.println("Sum = " + summe);
			System.out.println("Minimum = " + min);
			System.out.println("Maximum = " + max);
			System.out.printf("Mean = %4.2f\n", mean);
			System.out.printf("Reciprocal of mean = %4.2f\n", meanReciprocal);
			System.out.printf("Additive inverse of mean = %4.2f\n", meanNegative);
			System.out.printf("Absolute value of mean = %4.2f\n", meanAbsolute);
			System.out.println("Delta of minimum and maximum = " + delta);
			System.out.println("Sum of numbers from minimum to maximum = " + sumMinMax);

		} else {
			System.out.println("Bitte eine Ganze Zahl eingeben");
			sc.next();
		}
		sc.close();
	}

}
