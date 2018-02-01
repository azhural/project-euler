package solutions;

import java.util.BitSet;

public class Problem00023 {
    static final int LIMIT = 28124;
    static BitSet abundantFilter = new BitSet(LIMIT); // 0..28123

    public static void main(String[] args) {
        abundantFilter.clear();
        
        for(int i = 1; i < LIMIT; i++){
            int sum = 0;
            for(int j = i / 2; j > 0; j--){
                if(i % j == 0) sum += j;
                if(sum > i){
                    abundantFilter.set(i);
                    break;
                }
            }
        }
        
        long sum = 0L;
        
        for(int i = 1; i < LIMIT; i++){
            sum += isAbundantSum(i)?0:i;
        }
        
        System.out.println(sum);
                
    }
    
    public static boolean isAbundantSum(int input){
        for(int i = 1; i < input; i++){
            if(abundantFilter.get(i)){
                for(int j = 1; j < input; j++){
                    if(abundantFilter.get(j)){
                        int sum = i +j;
                        if(sum == input) return true;
                        else if(sum > input) break;
                    }
                }
            }
        }
        return false;
    }
}
