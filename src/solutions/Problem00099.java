package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import utils.Stopwatch;

public class Problem00099 {

    public static void main(String[] args) {
        double exp = 0.0;
        Stopwatch sw = new Stopwatch();
        int lineNo = 0;
        try {
            int linecount = 0;
            try (Scanner sc = new Scanner(new File("Input", "PE00099_largestexp.txt"))) {
                while (sc.hasNextLine()) {
                    linecount++;
                    String[] pair = sc.nextLine().split(",");
                    
                    double toTest = Double.parseDouble(pair[1]) * Math.log(Double.parseDouble(pair[0]));
                    if(toTest > exp){
                        System.out.println(toTest);
                        lineNo = linecount;
                        exp = toTest;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("FNF Exception");
            return;
        }
        
        System.out.println(sw.timeMS() + " " + lineNo);
    }
}

//public class Problem00099 {
//
//    public static void main(String[] args) {
//        BigInteger largestExp = BigInteger.ZERO;
//        Stopwatch sw = new Stopwatch();
//        int lineNo = 0;
//        try {
//            int linecount = 0;
//            try (Scanner sc = new Scanner(new File("Input", "PE00099_largestexp.txt"))) {
//                while (sc.hasNextLine()) {
//                    linecount++;
//                    System.out.println(linecount);
//                    String[] pair = sc.nextLine().split(",");
//                    BigInteger toTest = new BigInteger(pair[0]).pow(Integer.parseInt(pair[1]));
//                    if(toTest.compareTo(largestExp) > 0){
//                        largestExp = toTest;
//                        lineNo = linecount;
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("FNF Exception");
//            return;
//        }
//        
//        System.out.println(sw.timeMS() + " " + lineNo);
//    }
//}

