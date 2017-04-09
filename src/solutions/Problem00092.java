package solutions;

import java.util.HashSet;

import utils.Stopwatch;

public class Problem00092 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		// HashSet, so every number is unique
		HashSet<Integer> hs = new HashSet<Integer>();


		for (int i = 1; i < 10_000_000; i++) {
			int start = i;
			// if a number is present, that chain is known
			// second hashset for chains ending in 1 does not seem to add a performance boost
			if (!hs.contains(start)) {
				HashSet<Integer> chain = new HashSet<Integer>();

				while (true) {
					chain.add(start);
					if (start == 1){
						break;
					}
					else if (start == 89) {
						// dump chain in counting hashset
						for (Integer x : chain) {
							hs.add(x);
						}
						break;
					}
					// advance chain
					start = squareDigitSum(start);

				}
			}

		}

		System.out.println(sw.timeMS() + " " + hs.size());

	}

	public static int squareDigitSum(int input) {
		int output = 0;
		while (input != 0) {
			int lastDigit = input % 10;
			output += lastDigit * lastDigit;
			input /= 10;
		}
		return output;
	}

}
