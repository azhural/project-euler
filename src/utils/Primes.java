package utils;

import java.util.BitSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Primes {
    private final BitSet filter;
    private final int size;
    private final List<Integer> primes;
    
    public Primes(int size){
        this.size = size;
        filter = new BitSet(size);
        filter.clear();
        for(int i = 2; i < this.size; i++){
            filter.set(i);
        }
        int root = (int)Math.sqrt(this.size);
        for(int i = 2; i < root; i++){
            if(filter.get(i)){
                for(int j = i*i; j < this.size; j+=i){
                    filter.clear(j);
                }
            }
        }
        
        primes = new ArrayList<>();
        for(int i = 0; i < this.size; i++){
            if(filter.get(i)){
                primes.add(i);
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n < size) return filter.get(n);
        return false;
    }
    
    public List<Integer> getPrimeList(){
        return Collections.unmodifiableList(primes);
    }
}
