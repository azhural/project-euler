// Lychrel numbers

package solutions;

import java.math.BigInteger;
import utils.Stopwatch;

public class Problem00055 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		int count = 0;
		for (int i = 1; i < 10000; i++) {
			BigInteger forw = new BigInteger("" + i);
			BigInteger rev = new BigInteger(new StringBuilder(forw.toString()).reverse().toString());
			for (int j = 0; j < 50; j++) {
				forw = forw.add(rev);
				rev = new BigInteger(new StringBuilder(forw.toString()).reverse().toString());
				if (forw.equals(rev)) {
					break;
				}
				if (j == 49) {
					count++;
				}
			}
		}

		System.out.println(sw.timeMS() + " " + count);

	}

	public static long reverse(long input) {
		long output = 0;
		while (input != 0) {
			output = output * 10 + input % 10;
			input /= 10;
		}
		return output;
	}

}
