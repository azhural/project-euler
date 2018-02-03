package solutions;

import java.util.BitSet;

public class Problem00046 {
    public static void main(String[] args) {
        final int MAX = 10000;
        BitSet primes = new BitSet(MAX);
        primes.clear();
        
        for(int i = 2; i < MAX; i++){
            primes.set(i);
        }
        int root = (int) Math.sqrt(MAX) + 1;
        for(int i = 2; i < root; i++){
            if(primes.get(i)){
                for(int j = i*i; j < MAX; j += i){
                    primes.clear(j);
                }
            }
        }
        
        for(int i = 5; i < MAX; i+=2){
            if(!primes.get(i)){
                boolean disproved = true;
                for(int j = 2; j <= i-2; j++){
                    if(primes.get(j)){
                       int toSquare = (int)Math.sqrt((i-j)/2);
                       if(toSquare*toSquare*2 + j == i){
                           disproved = false;
                           break;
                       }
                    }
                }
                if(disproved){
                    System.out.println(i);
                    break;
                }
                    
            }
        }
    }
    
}
