package solutions;

import utils.Stopwatch;

public class Problem00021 {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
                
        int[] divisorSums = new int[10000]; //0..9999
        
        //fill
        for(int i = 1; i < divisorSums.length; i++){
            int sum = 1;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0) sum+=j;
            }
            divisorSums[i] = sum;
        }
        
        //check
        int amicableSum = 0;
        for(int i = 2; i < divisorSums.length; i++){
            if(divisorSums[i] < divisorSums.length && divisorSums[divisorSums[i]] == i && divisorSums[i] != i){
                amicableSum += i;
            }
        }
        
        System.out.println(amicableSum + " " + sw.timeMS());
    }
}
