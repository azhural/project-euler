// Smallest multiple

package solutions;

public class Problem00005 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		for (int i = 1;; i++) {
			if (checkDivisible(i, 20)) {
				long endTime = System.nanoTime();
				System.out.println((endTime - startTime) / 1000 / 1000 + "ms");
				System.out.println(i);
				return;
			}
		}

	}

	public static boolean checkDivisible(int input, int start) {
		if (start == 1)
			return true;
		if (input % start != 0) {
			return false;
		} else {
			return checkDivisible(input, start - 1);
		}
	}
}
