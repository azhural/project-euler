// 10001st prime

package solutions;

public class Problem00007 {
	public static void main(String[] args) {
		int n = 0;
		for (long i = 0;; i++) {
			if (checkIfPrime(i))
				n++;
			if (n == 10001) {
				System.out.println(n + " " + i);
				return;
			}
		}
	}

	public static boolean checkIfPrime(long input) {
		long root = (long) Math.sqrt(input);
		if (input < 2)
			return false;
		if (input == 2)
			return true;
		for (int i = 2; i <= root; i++) {
			if (input % i == 0)
				return false;
		}
		return true;
	}
}
