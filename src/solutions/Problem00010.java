// Summation of primes

package solutions;

import utils.Stopwatch;

public class Problem00010 {
	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		long sum = 0;
		int max = 2_000_000;
		boolean[] a = new boolean[max];
		a[0] = a[1] = false;
		for (int i = 2; i < max; ++i) {
			a[i] = true;
		}
		int root = (int) Math.sqrt(max) + 1;
		for (int i = 2; i < root; ++i) {
			if (a[i]) {
				for (int j = i * i; j < max; j += i) {
					a[j] = false;
				}
			}
		}

		for (int i = 0; i < max; ++i) {
			if (a[i]) {
				sum += i;
			}
		}

		System.out.println(timer.timeMS());
		System.out.println(sum);
	}

}
