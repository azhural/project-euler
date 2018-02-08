package solutions;

import utils.Primes;
import utils.Stopwatch;

public class Problem00058 {
    public static void main(String[] args) {
        
        Primes pri = new Primes(1_000_000_000);
        Stopwatch sw = new Stopwatch();
        int numbersDiag = 1;
        int primesDiag = 0;
        int currentCorner = 1;
        for(int i = 2;; i += 2){
            for(int j = 0; j < 4; j++){
                currentCorner += i;
                numbersDiag++;
                if(pri.isPrime(currentCorner)) primesDiag++;
            }
            if(1.0*primesDiag/numbersDiag < 0.1){
                System.out.println(i+1 + " " + currentCorner + " " + 1.0*primesDiag/numbersDiag + " " + sw.timeMS());
                return;
            }
        }
        
    }
}

