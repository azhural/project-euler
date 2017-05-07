package solutions;

import java.util.regex.Pattern;

import utils.Stopwatch;

public class Problem00206 {
	public static void main(String[] args){
		Stopwatch sw = new Stopwatch();
				
		//has to end in 00
		long lowerLimit = (long) Math.sqrt(10203040506070809L); //is uneven
		long upperLimit = (long) Math.sqrt(19293949596979899L)+1;
		//ending in 9 requires a 3 or 7 as last digit
		//since lowerLimit is uneven we can just skip all even numbers by adding 2
		for(long i = lowerLimit; i <= upperLimit; i += 2){
			long square = 100L * i * i;
			System.out.println(square);
			if(Pattern.matches("1\\d2\\d3\\d4\\d5\\d6\\d7\\d8\\d9\\d0", "" + square)){
				System.out.println(sw.timeMS() + " " + (10* i) + " " + square);
				return;
			}
		} 
	}	
}
