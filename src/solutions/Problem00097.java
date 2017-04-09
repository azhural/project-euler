package solutions;

import java.math.BigInteger;
import utils.Stopwatch;

public class Problem00097 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
//		BigInteger bi = new BigInteger("2");
//		BigInteger tenDigits = new BigInteger("10");
//		tenDigits = tenDigits.pow(10);
//		bi = bi.pow(7830457);
//		bi = bi.multiply(new BigInteger("28433"));
//		bi = bi.add(new BigInteger("1"));
//
//		System.out.println(sw.timeUS() + " " + bi.mod(tenDigits));

		// uglier but runs in 20-30us compared to about 6ms
		System.out.println(sw.timeUS() + " " + new BigInteger("2").pow(7830457).multiply(new BigInteger("28433"))
				.add(new BigInteger("1")).mod(new BigInteger("10").pow(10)));

	}

}
