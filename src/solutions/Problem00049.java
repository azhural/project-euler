// Prime permutations

package solutions;

public class Problem00049 {
	public static void main(String[] args) {
		int n = 10000;
		boolean[] sieve = new boolean[n];
		for (int i = 0; i < n; ++i) {
			sieve[i] = true;
		}
		int limit = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < limit; ++i) {
			if (sieve[i]) {
				for (int j = i * i; j < n; j += i) {
					sieve[j] = false;
				}

			}
		}

		for (int i = 1000; i < n; ++i) {
			if (sieve[i]) {
				int distance = (9999 - i) / 2;
				for (int j = 1; j <= distance; ++j) {
					if (sieve[i + j] && sieve[i + 2 * j]) {
						int sum = digitSum(i);
						if (sum == digitSum(i + j) && sum == digitSum(i + j + j)) {
							boolean flag = true;
							for (int k = 0; k < 4; ++k) {
								if (!String.valueOf(i).contains(String.valueOf(i + j).charAt(k) + "")
										|| !String.valueOf(i).contains(String.valueOf(i + j + j).charAt(k) + "")
										|| !String.valueOf(i + j).contains(String.valueOf(i).charAt(k) + "")
										|| !String.valueOf(i + j).contains(String.valueOf(i + j + j).charAt(k) + "")
										|| !String.valueOf(i + j + j).contains(String.valueOf(i).charAt(k) + "")
										|| !String.valueOf(i + j + j).contains(String.valueOf(i + j).charAt(k) + "")) {
									flag = false;
								}
							}
							if (flag) {
								System.out.println(i + " " + (i + j) + " " + (i + 2 * j));
							}
						}
					}
				}
			}

		}

	}

	public static int digitSum(int input) {
		int sum = 0;
		do {
			sum += input % 10;
		} while ((input /= 10) != 0);
		return sum;
	}
}
