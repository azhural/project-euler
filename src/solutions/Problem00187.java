package solutions;

import java.util.BitSet;
import java.util.List;
import utils.Primes;

public class Problem00187 {
    public static void main(String[] args) {
        final int LIMIT = 100_000_000;
        Primes sieve = new Primes(LIMIT);
        
        int cnt = 0;
        
        List<Integer> list = sieve.getPrimeList();
        BitSet sv = new BitSet(LIMIT);
        list.forEach((i) -> {
            sv.set(i);
        });

        for(int i = LIMIT-1; i > 1; i--){
            if(sv.get(i)){
                for(int j = LIMIT/i; j > 1; j--){
                    if(sv.get(j)){
                        cnt++;
                    }
                }
            }
            sv.clear(i);
        }
        
        System.out.println(cnt);
    }
}
