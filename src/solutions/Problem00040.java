// Champernowne's constant

package solutions;

import utils.Stopwatch;

public class Problem00040 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();

		StringBuilder sb = new StringBuilder("");

		int n = 1;

		while (sb.length() < 1_000_000) {
			sb.append(n);
			n++;
		}

		System.out.println(sb);

		int product = 1;
		for (int i = 1; i <= 1_000_000; i *= 10) {
			product *= Integer.parseInt(sb.charAt(i - 1) + "");
		}

		System.out.println(sw.timeMS() + " " + product);

	}
}
