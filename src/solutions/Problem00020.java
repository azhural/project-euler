// Factorial digit sum

package solutions;

import java.math.BigInteger;

import utils.Stopwatch;

public class Problem00020 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		BigInteger bi = new BigInteger("1");
		for(int i = 100; i > 0; i--){
			bi = bi.multiply(new BigInteger("" + i));
		}
		String s = bi.toString();
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			sum += Integer.parseInt(s.charAt(i) + "");
		}
		System.out.println(sw.timeMS() + " " + sum);

	}

}
