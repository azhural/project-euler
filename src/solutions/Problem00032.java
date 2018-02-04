package solutions;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Problem00032 {
    public static void main(String[] args) {
        Set<Integer> products = new TreeSet<>();
        
        for(int i = 1; i < 100; i++){
            for(int j = 100; j < 10_000; j++){
                int product = i * j;
                long checkPandigital = i;
                int makeRoom = j;
                while(makeRoom > 0){
                    checkPandigital *= 10;
                    makeRoom /= 10;
                }
                checkPandigital += j;
                makeRoom = product;
                while(makeRoom > 0){
                    checkPandigital *= 10;
                    makeRoom /= 10;
                }
                checkPandigital += product;
                if(isOneToNinePandigital(checkPandigital)){
                    products.add(product);
                }
            }
        }
        
        long sum = 0L;
        for(int i : products){
            sum += i;
        }
        System.out.println(sum);
    }
    
    public static boolean isOneToNinePandigital(long n){
        Set<Long> set = new TreeSet<>();
        if(n < 1_000_000_000 && n >= 100_000_000){
            while(n > 0){ //place all digits in set
                set.add(n%10);
                n /= 10;
            }
            if(set.size() == 9 && !set.contains(0L)) return true; //9 digits in set and not 0
        }
        return false;
    }
}
