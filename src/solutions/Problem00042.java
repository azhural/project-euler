package solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.BitSet;
import java.util.Scanner;

import utils.Stopwatch;

public class Problem00042 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		final int SIZE = 26 * 20; // get all triangle numbers up to 20 letter words
		BitSet triangles = new BitSet(SIZE);
		for(int n = 0; ; n++){
			int t = n * (n+1) /2; 
			if(t >= SIZE){
				break;
			}else{
				triangles.set(t);
			}
		}
		System.out.println("triangles");
		String[] array = null;
		try {
			Scanner sc = new Scanner(new File("Input", "PE00042_words.txt"));
			while (sc.hasNextLine()) {
				array = sc.nextLine().replace("\"", "").split(",");
			}
			System.out.println("input");
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				int charValue = 0;
				for(int j = 0; j < array[i].length(); j++){
					charValue += array[i].charAt(j) -64;
				}
				if(triangles.get(charValue)){
					counter++;
				}
			}
			
			System.out.println(sw.timeMS()+ " "+ counter);

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

