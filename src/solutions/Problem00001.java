// Multiples of 3 and 5

package solutions;

public class Problem00001 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1000;
		for (int i = 0; i < n; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
