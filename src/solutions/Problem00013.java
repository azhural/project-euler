// Large sum

package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class Problem00013 {
    public static void main(String[] args) {
        ArrayList<BigInteger> array = new ArrayList<BigInteger>();

        try {
            Scanner sc = new Scanner(new File("Input","PE00013_BigInts"));
            while (sc.hasNextLine()) {
                array.add(new BigInteger(sc.nextLine()));
            }

            BigInteger sum = new BigInteger("0");

            for (BigInteger bi : array) {
                sum = sum.add(bi);
            }

            System.out.println(sum);

            String bi = sum.toString();
            String subbi = bi.substring(0, 10);
            System.out.println(subbi);
            long subbiL = Long.parseLong(subbi);
            System.out.println(subbiL);

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
