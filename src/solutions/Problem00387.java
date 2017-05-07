package solutions;

import java.util.BitSet;

public class Problem00387 {

	public static void main(String[] args) {
		int MAX_SIZE = 10000;
		BitSet sieve = new BitSet(MAX_SIZE);
		sieve.set(2, MAX_SIZE);
		for (int i = 2; i < (int) Math.sqrt(MAX_SIZE) + 1; i++) {
			if (sieve.get(i)) {
				for (int j = i * i; j < MAX_SIZE; j += i) {
					sieve.clear(j);
				}
			}
		}

		int sum = 0;
		for (int i = 1; i < MAX_SIZE; i++) {
			if (isStrongRTHarshadPrime(i, sieve)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

	static boolean isRTHarshad(int input) {
		int digSum = digitSum(input);
		if (input == digSum)
			return true;
		if (input % digSum == 0) {
			return isRTHarshad(input / 10);
		} else
			return false;
	}

	static boolean isStrongRTHarshadPrime(int input, BitSet sieve) {
		if (input / 10 != 0) {
			return (sieve.get(input) && isStrongHarshad(input / 10, sieve) && isRTHarshad(input / 10));
		} else
			return false;
	}

	static boolean isStrongHarshad(int input, BitSet sieve) {
		int digSum = digitSum(input);
		if (input % digSum == 0) {
			return (sieve.get(input / digSum));
		} else
			return false;
	}

	static int digitSum(int input) {
		int output = 0;
		if (input / 10 == 0) {
			output += input;
		} else {
			output += input % 10 + digitSum(input / 10);
		}
		return output;
	}
}
