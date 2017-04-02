// Triangular, pentagonal, and hexagonal

package solutions;

import java.util.BitSet;
import utils.Stopwatch;

public class Problem00045 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		final int MAX_SIZE = 2_000_000_000;
		BitSet t = new BitSet(MAX_SIZE);
		BitSet p = new BitSet(MAX_SIZE);
		BitSet h = new BitSet(MAX_SIZE);
		long calc = 0L;
		for (int i = 1;; i++) {
			calc = (long) i * (i + 1) / 2;
			if (calc > MAX_SIZE) {
				break;
			} else {
				t.set(Math.toIntExact(calc));
			}
		}
		calc = 0L;
		for (int i = 1;; i++) {
			calc = (long) i * (3 * i - 1) / 2;
			if (calc > MAX_SIZE) {
				System.out.println(calc);
				break;
			} else {
				p.set(Math.toIntExact(calc));
			}
		}
		calc = 0L;
		for (int i = 1;; i++) {
			calc = (long) i * (2 * i - 1);
			if (calc > MAX_SIZE) {
				break;
			} else {
				h.set(Math.toIntExact(calc));
			}
		}

		t.and(p);
		t.and(h);

		for (int i = 0; i < MAX_SIZE; i++) {
			if (t.get(i)) {
				System.out.println(sw.timeMS() + " " + i);
			}
		}

	}
}
