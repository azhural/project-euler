package solutions;

import java.util.BitSet;
import java.util.Set;
import java.util.TreeSet;

public class Problem00072 {
    public static void main(String[] args) {
        final int LIMIT = 1_000_000;
        BitSet bs = new BitSet(LIMIT);
        bs.clear();
        int chains = 0;
        for(int i = 0; i < LIMIT; i++){
            if(!bs.get(i)){
                int current = i;
                Set<Integer> chain = new TreeSet<>();
                while(!chain.contains(current)){
                    chain.add(current);
                    current = getDigitFactiorial(current);
                }
                chain.forEach((link) -> {
                    bs.set(link);
                });
                if(chain.size() == 60) chains++;
            }
        }
        System.out.println(chains);
    }

    private static int getDigitFactiorial(int current) {
        int sum = 0;
        while(current > 0){
            sum += getFactorial(current % 10);
            current/= 10;
        }
        return sum;
    }
    
    private static int  getFactorial(int n){
        if(n == 0) return 1;
        return n*getFactorial(n-1);
    }
}
