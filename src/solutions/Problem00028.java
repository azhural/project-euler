package solutions;

public class Problem00028 {
    public static void main(String[] args) {
        long sum = 1L;
        int currentCorner = 1;
        for(int i = 2; i < 1001; i += 2){
            for(int j = 0; j < 4; j++){
                currentCorner += i;
                sum += currentCorner;
            }
        }
        
        System.out.println(sum);
    }
}
