// Highly divisible triangular number

package solutions;
import utils.Stopwatch;
import java.util.ArrayList;

public class Problem00012 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		final int MAX_SIZE = 1_000_000_000;
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		long triangle = 0;
		for (int i = 1; i < MAX_SIZE; i++) {
			triangle += i;
			if (triangle > Integer.MAX_VALUE)
				break;
			divisors = getDivisors(Math.toIntExact(triangle));
			if (divisors.size() > 500) {
				System.out.println(sw.timeMS() + " " + triangle);
				return;
			}

		}

	}

	public static ArrayList<Integer> getDivisors(int input) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i < (int) Math.sqrt(input) + 1; i++) {
			if (input % i == 0) {
				int secondDivisor = input / i;
				divisors.add(i);
				if (secondDivisor != i) {
					divisors.add(secondDivisor);
				}
			}
		}
		return divisors;
	}
}
