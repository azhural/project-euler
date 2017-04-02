// Pentagon numbers

package solutions;

import java.util.BitSet;
import utils.Stopwatch;

public class Problem00044 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		final int MAX_SIZE = 10000000;
		BitSet pen = new BitSet(MAX_SIZE);

		for (int i = 1;; i++) {
			long pentagon = i * (3 * i - 1) / 2;
			if (pentagon >= MAX_SIZE)
				break;
			pen.set(Math.toIntExact(pentagon));
		}
		int lowestD = Integer.MAX_VALUE;
		int theK = 0;
		int theJ = 0;
		for (int j = 0; j < MAX_SIZE / 2; j++) {
			if (pen.get(j)) {
				for (int k = j + 1; k < MAX_SIZE; k++) {
					if (pen.get(k)) {
						int sum = j + k;
						if (pen.get(sum)) {
							int diff = Math.abs(k - j);
							if (diff < lowestD && pen.get(diff)) {
								lowestD = diff;
								theK = k;
								theJ = j;
							}
						}

					}
				}
			}
		}

		System.out.println(sw.timeMS() + " " + theK + " " + theJ + " " + lowestD);

	}
}
