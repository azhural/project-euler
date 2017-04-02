// Sum square difference

package solutions;

public class Problem00006 {
	public static void main(String[] args) {
		long sumSq = 0; // Sum of Squares
		long sqSum = 0; // Square of Sums
		long startTime = System.nanoTime();
		for (int i = 1; i <= 100; i++) {
			sumSq += i * i;
			sqSum += i;
		}
		sqSum *= sqSum;
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) / 1000 / 1000);
		System.out.println(sqSum);
		System.out.println(sumSq);
		System.out.println(sqSum - sumSq);

	}
}
