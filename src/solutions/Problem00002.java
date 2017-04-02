// Even Fibonacci numbers

package solutions;

public class Problem00002 {
	public static void main(String[] args) {
		int limit = 4_000_000;
		int sum = 0;
		int a = 0;
		int b = 1;

		while (b < limit) {
			int temp = b;
			b += a;
			a = temp;
			if (b % 2 == 0) {
				sum += b;
			}
			System.out.println(b);
		}

		System.out.println(sum);

	}
}
