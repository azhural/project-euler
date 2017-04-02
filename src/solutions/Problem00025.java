// 1000-digit Fibonacci number

package solutions;

import java.math.BigInteger;
import utils.Stopwatch;
 
public class Problem00025 {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        int index = 1;
        BigInteger nMinusOne = new BigInteger("0");
        BigInteger n = new BigInteger("1");

        while (n.toString().length() < 1000) {
            BigInteger temp = new BigInteger(n.toString());
            n = n.add(nMinusOne);
            nMinusOne = temp;
            index++;
        }

        System.out.println(sw.timeMS() + " " + index);

    }
}
