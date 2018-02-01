package solutions;

import java.util.ArrayList;

public class Problem00024 {
    public static void main(String[] args) {
        ArrayList<Long> allDigits = new ArrayList<>();
        ArrayList<Long> permutations = new ArrayList<>();
        for(long i = 0; i < 10; i++) allDigits.add(i);
        int startLong = 0;
        getPermutations(startLong, permutations, allDigits);
        
//        permutations.forEach((i) -> {
//            System.out.println(i.toString());
//        });
        
        System.out.println(permutations.get(1_000_000 - 1));
        
    }
    
    public static void getPermutations(long startLong, ArrayList<Long> listOfPermutations, ArrayList<Long> digits){
        if(digits.size() > 0){
            long gpInt = startLong*10;
            for(int i = 0; i < digits.size(); i++){
                //add element to permutation, pop element, if there's still elements left repeat until empty
                ArrayList<Long> newDigits = new ArrayList<>(digits);
                long forInt = gpInt + newDigits.get(i);
                newDigits.remove(i);
                getPermutations(forInt, listOfPermutations, newDigits);
            }
        }else{
            listOfPermutations.add(startLong);
        }
    }
    
}
