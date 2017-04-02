// Digit fifth powers

package solutions;

import utils.Stopwatch;

public class Problem00030 {
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();

		// lookup table to cut down on calculations (hopefully)
		int numbers = 10;
		int[] fifthPowers = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			fifthPowers[i] = (int) Math.pow(i, 5);
		}

		// 6-digits of 9s can produce a 6 digit number, 6-digits of 9s also
		// produce 6 digits
		int limit = 6 * fifthPowers[9];
		int start = 10;
		long sum = 0;

		for (int i = start; i < limit; i++) {
			// convert to string for easy access to digits
			String toTest = Integer.toString(i);

			// produce digit fifth powers sum
			int fifthPowerSum = 0;
			for (int j = 0; j < toTest.length(); j++) {
				fifthPowerSum += fifthPowers[Character.getNumericValue(toTest.charAt(j))];
			}

			if (i == fifthPowerSum) {
				sum += i;
			}
		}

		System.out.println(timer.timeMS() + " " + sum);
	}
}
