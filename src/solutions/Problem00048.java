// Self powers

package solutions;

import java.math.BigInteger;
import utils.Stopwatch;

public class Problem00048 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();

		BigInteger sum = new BigInteger("0");

		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(new BigInteger(Integer.toString(i)).pow(i));
		}

		System.out.println(sw.timeMS() + " " + sum.mod(new BigInteger("10").pow(10)));
	}
}
