package solutions;

import java.math.BigInteger;

public class Problem00053 {
    public static void main(String[] args) {
        int sum = 0;
        for(int n = 1; n <= 100; n++){
            for(int r = 1; r < n; r++){
                if(c(n,r).compareTo(new BigInteger(1_000_000 + "")) > 0) sum++;
            }
        }
        System.out.println(sum);
    }
    
    public static BigInteger factorial(int n){
        if(n <= 0) return BigInteger.ONE;
        BigInteger bi = new BigInteger(n + "");
        for(int i = n - 1; i > 0; i--){
            bi = bi.multiply(new BigInteger(i + ""));
        }
        return bi;
    }
    
    public static BigInteger c(int n, int r){
        return factorial(n).divide(factorial(r).multiply(factorial(n-r)));
    }
    
}
