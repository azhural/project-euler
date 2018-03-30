package solutions;

import java.util.HashSet;
import java.util.Set;

public class Problem00125 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        for(int i = 1; i < 10_000; i++){
            int sum = sq(i);
            boolean first = true;
            for(int j = i+1; sum < 100_000_000; j++){
                if(!first){
                    numbers.add(sum);
                }else{
                    first = false;
                }
                sum += sq(j);
            }
        }
        numbers.remove(0);
        
        System.out.println("All numbers collected " + numbers.size());
        
        long cnt = 0L;
        
        for(int i : numbers){
            if(isPalindrome(i)) cnt += i;
        }
        
        System.out.println(cnt);
    }
    
    private static int sq(int x){
        return x*x;
    }
    
    private static boolean isPalindrome(int input) {
        String s = "" + input;
        return palLogic(s, s.length() - 1, 0);
    }

    private static boolean palLogic(String s, int front, int back) {
        if (back >= front)
            return true;
        if (s.charAt(front) == s.charAt(back)) {
            return palLogic(s, front - 1, back + 1);
        } else {
            return false;
        }
    }
}
        