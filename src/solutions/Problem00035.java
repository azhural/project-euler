// Circular primes

package solutions;

import utils.Stopwatch;

public class Problem00035 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();

		// create sieve
		int limit = 1_000_000;
		boolean[] sieve = new boolean[limit];
		for (int i = 2; i < limit; i++) {
			sieve[i] = true;
		}
		int root = (int) (Math.sqrt(limit) + 1);
		for (int i = 2; i < root; i++) {
			if (sieve[i]) {
				for (int j = i * i; j < limit; j += i) {
					sieve[j] = false;
				}
			}
		}

		int count = 0;

		for (int i = 2; i < limit; i++) {
			if (sieve[i]) {
				String digits = Integer.toString(i);
				int length = digits.length();
				int countToAdd = 0;
				boolean flag = true;
				// check for prime, set false to make sieve smaller, carry true
				// flag if all are prime, rotate digits
				for (int j = 0; j < length; j++) {
					if (!sieve[Integer.parseInt(digits)]) {
						flag = false;
						// not breaking after first nonprime to get rid of all
						// rotated numbers
					} else {
						sieve[Integer.parseInt(digits)] = false;
					}
					countToAdd++;
					// get rid of same digit numbers
					String oldDigits = digits;
					digits = digits.charAt(length - 1) + digits.substring(0, length - 1);
					if (oldDigits.equals(digits))
						break;
				}

				if (flag) {
					count += countToAdd;
				}
			}
		}

		System.out.println(sw.timeMS() + " " + count);

	}
}
