// Number letter counts
package solutions;

import utils.Stopwatch;

public class Problem00017 {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += countLetters(i);
		}
		System.out.println(sw.timeUS() + " " + sum + " " + countLetters(342) + " " + countLetters(115));

	}

	public static int countLetters(int input) {
		if (input < 1 || input > 1000)
			return 0;
		if (input == 1000)
			return numberRules(1) + "thousand".length();
		int output = 0;
		if (input >= 100) {
			output += "hundred".length();
			output += numberRules(input /100);
			if(input % 100 == 0){
				return output;
			}else{
				output += "and".length();
			}
			//leave only last 2 digits for evaluation
			input %= 100;
		}
		output += numberRules(input);
		
		return output;
	}
	
	public static int numberRules(int input){
		if(input > 10 && input < 20){
			switch(input){
			case 11: return "eleven".length();
			case 12: return "twelve".length();
			case 13: return "thirteen".length();
			case 14: return "fourteen".length();
			case 15: return "fifteen".length();
			case 16: return "sixteen".length();
			case 17: return "seventeen".length();
			case 18: return "eighteen".length();
			case 19: return "nineteen".length();
			default: return 0;
			}
		}
		int output = 0;
		switch(input / 10){
		case 1: output += "ten".length(); break;
		case 2: output += "twenty".length();break;
		case 3: output += "thirty".length();break;
		case 4: output += "forty".length();break;
		case 5: output += "fifty".length();break;
		case 6: output += "sixty".length();break;
		case 7: output += "seventy".length();break;
		case 8: output += "eighty".length();break;
		case 9: output += "ninety".length();break;
		default: output += 0;			
		}
		switch(input % 10){
		case 1: output += "one".length();break;
		case 2: output += "two".length();break;
		case 3: output += "three".length();break;
		case 4: output += "four".length();break;
		case 5: output += "five".length();break;
		case 6: output += "six".length();break;
		case 7: output += "seven".length();break;
		case 8: output += "eight".length();break;
		case 9: output += "nine".length();break;
		default: output += 0;
		}
		return output;
	}
}
