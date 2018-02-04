package solutions;

import java.util.Set;
import java.util.TreeSet;

public class Problem00038 {
    public static void main(String[] args) {
        int number = 9;
        int pandigital = 918273645;
        
        // search space reduction
        // 90 <- contains 0
        // 99 <- 9 appears twice
        // 91*1 (2digits) 91*2 (3digits) 91*3 (3digits) -> 8 digits
        // 912-> 3 + 4 + 4  = 11
        // 9876 -> 4 + 5 = 9
        // search only in 9182...9876, lower limit given by 9 * 12345
        
        for(int i = 9182; i <= 9876; i++){
            int toCheck = i*100000 + i*2;
            if(isOneToNinePandigital(toCheck) && toCheck > pandigital){
                pandigital = toCheck;
                number = i;
            }
        }
        
        System.out.println(number + " " + pandigital);
        
    }
    
    public static boolean isOneToNinePandigital(int n){
        Set<Integer> set = new TreeSet<>();
        if(n < 1_000_000_000){
            while(n > 0){ //place all digits in set
                set.add(n%10);
                n /= 10;
            }
            if(set.size() == 9 && !set.contains(0)) return true; //9 digits in set and not 0
        }
        return false;
    }
}
