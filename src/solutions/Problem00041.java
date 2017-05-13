package solutions;

import java.util.BitSet;

public class Problem00041 {

	public static void main(String[] args) {
		int MAX_SIZE = 1_000_000_000;
		BitSet sieve = new BitSet(MAX_SIZE);
		sieve.set(2, MAX_SIZE);
		for (int i = 2; i < (int) Math.sqrt(MAX_SIZE); i++) {
			if (sieve.get(i)) {
				for (int j = i * i; j < MAX_SIZE; j += i) {
					sieve.clear(j);
				}
			}
		}

		for (int i = MAX_SIZE - 1; i > 0; i--) {
			if (sieve.get(i)) {
				String s = Integer.valueOf(i).toString();
				for (int j = s.length(); j >= 0; j--) {
					if (j == 0) {
						System.out.println(s);
						return;
					}
					if (!s.contains("" + j))
						break;
				}
			}
		}

	}

}
