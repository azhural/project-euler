// Powerful digit sum
package solutions;

import java.math.BigInteger;

import utils.Stopwatch;

public class Problem00056 {
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		int maxSum = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger bi = new BigInteger("" + a);
				bi = bi.pow(b);
				int sum = 0;
				String biString = bi.toString();
				for(int i = 0; i < biString.length(); i++){
					sum += Integer.parseInt("" +biString.charAt(i));
				}
				if(sum > maxSum) maxSum = sum;
			}
		}
		
		System.out.println(sw.timeMS() + " " + maxSum);

	}
}
