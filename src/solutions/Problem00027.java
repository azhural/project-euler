// Quadratic primes

package solutions;

public class Problem00027 {
	public static void main(String[] args) {
		int bestA = -999;
		int bestB = -1000;
		int bestN = 0;

		// sieve of Epo
		int max = 2_000_000;
		boolean[] sieve = new boolean[max];
		sieve[0] = sieve[1] = false;
		for (int i = 2; i < max; ++i) {
			sieve[i] = true;
		}
		int root = (int) Math.sqrt(max) + 1;
		for (int i = 2; i < root; ++i) {
			if (sieve[i]) {
				for (int j = i * i; j < max; j += i) {
					sieve[j] = false;
				}
			}
		}

		for (int a = -999; a < 1000; ++a) {
			for (int b = -1000; b <= 1000; ++b) {
				for (int n = 0;; ++n) {
					int toTest = n * n + a * n + b;
					if (toTest <= 1)
						break;
					if (sieve[toTest]) {
						if (n > bestN) {
							bestN = n;
							bestA = a;
							bestB = b;
						}
					} else {
						break;
					}
				}
			}
		}

		System.out.println("a: " + bestA + "; b: " + bestB + "; n: " + bestN + "; a*b: " + bestA * bestB);

	}
}
