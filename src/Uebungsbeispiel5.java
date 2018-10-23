import java.util.Scanner;

/*
* <2018.10.18 - Übungen>
* 5. Übungsbeispiel
* Author: <Thomas Urlacher>
* Last Change: <2018.10.18>
*/

public class Uebungsbeispiel5 {

	public static void main(String[] args) {
		java.util.Locale.setDefault(new java.util.Locale("en", "US"));

		int amount1 = 0;
		int amount2 = 0;
		int countFirst = 0;
		Scanner sc = new Scanner(System.in);

		amount1 = inputScanner(sc);
		amount2 = inputScanner(sc);
		
		sc.close();

		int min = valueMin(amount1, amount2);
		int max = valueMax(amount1, amount2);

		System.out.printf("min(%d,%d) = %d\n", amount1, amount2, min);
		System.out.printf("max(%d,%d) = %d\n", amount1, amount2, max);
		System.out.printf("sum(%d,%d) = %d\n", amount1, amount2, valueSum(amount1, amount2));
		System.out.printf("sumFromTo(%d,%d) = %d\n", amount1, amount2, valueSumOfIntegers(amount1, amount2));
		System.out.printf("delta(%d,%d) = %d\n", amount1, amount2, valueDelta(amount1, amount2));
		System.out.printf("mean(%d,%d) = %5.2f\n", amount1, amount2, valueMean(amount1, amount2));
		System.out.printf("gcd(%d,%d) = %d\n", amount1, amount2, valueGcd(amount1, amount2));
		System.out.printf("lcm(%d,%d) = %d\n", amount1, amount2, valueLcm(amount1, amount2));

		System.out.printf("primes(%d,%d) = {", amount1, amount2);
		while (min < max) {
			if (checkPrime(min) == true) {
				if (countFirst == 0) {
					++countFirst;
					System.out.print(min);
				} else if (countFirst % 10 == 0) {
					++countFirst;
					System.out.print(",\n \t\t " + min);
				} else {
					++countFirst;
					System.out.print(", " + min);
				}
			}
			++min;
		}
		System.out.println("}"); //# Count " + countFirst
	}

	/*
	 * Waits for Entering a valid Input Valid Inputs > 0 || Integer
	 */
	public static int inputScanner(Scanner sc) {
		int amount = 0;
		
		while (true) {
			System.out.print("Enter a positive number: ");
			if (sc.hasNextInt()) {
				amount = sc.nextInt();
			} else
				sc.next();
			if (amount > 0)
				break;
		}
		return amount;

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

	/*
	 * Returns the sum of 2 integers
	 */
	public static long valueSum(int value1, int value2) {

		long summe = value1 + value2;

		return summe;
	}

	/*
	 * Returns the sum of all integers between 2 integers
	 */
	public static int valueSumOfIntegers(int value1, int value2) {

		int min = valueMin(value1, value2);
		int max = valueMax(value1, value2);

		int delta = max - min;

		int summe = (min + max) * (delta + 1) / 2;

		return summe;
	}

	/*
	 * Returns the delta between 2 integers
	 */
	public static int valueDelta(int value1, int value2) {

		int min = valueMin(value1, value2);
		int max = valueMax(value1, value2);

		int delta = max - min;
		return delta;
	}

	/*
	 * Returns the delta between 2 integers
	 */
	public static double valueMean(int value1, int value2) {

		double mean = 1.0 * (value1 + value2) / 2;
		return mean;
	}

	/*
	 * Returns the gdc between 2 integers
	 */
	public static int valueGcd(int value1, int value2) {

		int min = valueMin(value1, value2);
		int max = valueMax(value1, value2);

		while (true) {

			if (max > min) {
				max -= min;
			} else if (max < min) {
				min -= max;
			} else {
				return min;
			}

		}
	}

	/*
	 * Returns the lcm between 2 integers
	 */
	public static int valueLcm(int value1, int value2) {

		int min = valueMin(value1, value2);
		int max = valueMax(value1, value2);
		int gcd = valueGcd(value1, value2);

		return (min * max) / gcd;
	}

	/*
	 * Returns true/false if value is prime
	 */
	public static boolean checkPrime(int value1) {

		if (value1 == 1) {
			return false;
		}
		
		for (int count = 2; count < value1; count++) {
			if (value1 % count == 0)
				return false;
		}
		return true;
	}

}
