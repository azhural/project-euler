package solutions;

import java.math.BigInteger;
import java.util.TreeSet;

public class Problem00029 {
    public static void main(String[] args) {
        TreeSet<BigInteger> ts = new TreeSet<>();
        
        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                ts.add(new BigInteger(a + "").pow(b));
            }
        }
        
        System.out.println(ts.size());
    }
}
