// Consecutive prime sum

package solutions;

import utils.Stopwatch;

public class Problem00050 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();

		int limit = 1000000;

		boolean[] sieve = new boolean[limit];
		for (int i = 0; i < limit; i++) {
			sieve[i] = true;
		}
		for (int i = 2; i < (int) Math.sqrt(limit) + 1; i++) {
			if (sieve[i]) {
				for (int j = i * i; j < limit; j += i) {
					sieve[j] = false;
				}
			}
		}

		int largestN = 0;
		long largestNPrime = 0;

		// only needs check half the primes, since (limit/2)+(limit/2+1) > limit
		for (int i = 2; i < (limit / 2 + 1); i++) {
			if (sieve[i]) {
				int n = 1;
				int sum = i;
				for (int j = i + 1; j < (limit / 2 + 1); j++) {
					if (sieve[j]) {
						n++;
						sum += j;
						if (sum >= limit)
							break;
						if (sieve[sum] && (n > largestN)) {
							largestN = n;
							largestNPrime = sum;
						}
					}
				}
			}
		}

		System.out.println(sw.timeMS() + " " + largestN + " " + largestNPrime);

	}
}
