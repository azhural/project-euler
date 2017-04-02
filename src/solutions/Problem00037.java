// Truncatable primes

package solutions;

import utils.Stopwatch;

public class Problem00037 {
	public static void main(String[] args) {

		Stopwatch sw = new Stopwatch();
		int limit = 1_000_000;
		long sum = 0;
		for (int i = 0; i < limit; i++) {
			String decimal = Integer.toString(i);
			if (decimal.equals(reverse(decimal))) {
				String binary = Integer.toBinaryString(i);
				if (binary.equals(reverse(binary))) {
					sum += i;
				}
			}
		}

		System.out.println(sw.timeMS() + " " + sum);

	}

	public static String reverse(String input) {
		int length = input.length();
		char[] carray = new char[length];
		for (int i = 0; i < length; i++) {
			carray[i] = input.charAt(length - 1 - i);
		}
		return new String(carray);
	}
}
