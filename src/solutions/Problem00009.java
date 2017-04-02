// Special Pythagorean triplet

package solutions;

public class Problem00009 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		for (int a = 1; a <= 1000; ++a) {
			for (int b = 1; b <= 1000; ++b) {
				for (int c = 1; c <= 1000; ++c) {
					if (((a + b + c) == 1000) && (c * c == (a * a + b * b))) {
						long endTime = System.nanoTime();
						System.out.println((endTime - startTime) / 1000 / 1000 + "ms");
						System.out.println(a * b * c);
						return;
					}
				}
			}
		}

	}
}
