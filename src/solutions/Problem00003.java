// Largest prime factor

package solutions;

public class Problem00003 {
	public static void main(String[] args) {
		long toCheck = 600851475143L;
		long root = (long) Math.sqrt(toCheck);

		for (long i = root; i > 1; i--) {
			if (toCheck % i == 0 && isPrime(i)) {
				System.out.println(i);
				break;
			}
		}

	}

	public static boolean isPrime(long input) {
		long root = (long) Math.sqrt(input);
		for (long i = root; i > 1; i--) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}
