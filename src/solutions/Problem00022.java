package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem00022 {

	public static void main(String[] args) {
		String[] array = null;
		try {
			Scanner sc = new Scanner(new File("Input", "PE00022_names.txt"));
			while (sc.hasNextLine()) {
				array = sc.nextLine().replace("\"", "").split(",");
			}
			Arrays.sort(array);
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				int charValue = 0;
				for(int j = 0; j < array[i].length(); j++){
					charValue += array[i].charAt(j) -64;
				}
				sum += (i+1) * charValue;
			}
			
			System.out.println(sum);

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
