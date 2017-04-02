// Permuted multiples

package solutions;

import utils.Stopwatch;

public class Problem00052 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();

		for (int i = 1;; i++) {
			boolean flag = true;
			// start with 6x, 6x is the most likely to get a different digit
			// count
			for (int j = 6; j > 2; j--) {
				if (!sameDigits(i, j * i)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(sw.timeMS() + " " + i);
				return;
			}
		}

	}

	public static boolean sameDigits(int a, int b) {
		String aString = Integer.toString(a);
		String bString = Integer.toString(b);
		int aLength = aString.length();
		int bLength = bString.length();
		if (aLength != bLength)
			return false;
		for (int i = 0; i < aLength; i++) {
			if (!bString.contains(aString.charAt(i) + "") || !aString.contains(bString.charAt(i) + "")) {
				return false;
			}
		}
		return true;
	}
}
