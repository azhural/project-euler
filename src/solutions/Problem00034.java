// Digit factorials

package solutions;

import utils.Stopwatch;

public class Problem00034 {
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();

		// lookup table to cut down on calculations (hopefully)
		int numbers = 10;
		int[] factorials = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			factorials[i] = calcFactorial(i);
		}

		// 7-digits of 9s can produce a 7 digit number, 8-digits of 9s also
		// produce 7 digits
		int limit = 7 * factorials[9];
		int start = 10;
		long sum = 0;

		for (int i = start; i < limit; i++) {
			// convert to string for easy access to digits
			String toTest = Integer.toString(i);

			// produce factorial sum
			int factorialSum = 0;
			for (int j = 0; j < toTest.length(); j++) {
				factorialSum += factorials[Character.getNumericValue(toTest.charAt(j))];
			}

			if (i == factorialSum) {
				sum += i;
			}
		}

		System.out.println(timer.timeMS() + " " + sum);
	}

	public static int calcFactorial(int input) {
		if (input <= 1) {
			return 1;
		}
		return input * calcFactorial(input - 1);
	}
}
