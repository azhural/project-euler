// Power digit sum

package solutions;

import utils.Stopwatch;
import java.math.BigInteger;

public class Problem00016 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		BigInteger bi = new BigInteger("2");
		bi = bi.pow(1000);

		String biString = bi.toString();
		int sum = 0;

		for (int i = 0; i < biString.length(); i++) {
			sum += Integer.parseInt(biString.charAt(i) + "");
		}

		System.out.println(sw.timeMS() + " " + sum);

	}
}
