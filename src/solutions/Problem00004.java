//Largest palindrome product

package solutions;

public class Problem00004 {
	public static void main(String[] args) {
		if (isPalindrome(91 * 99)) {
			System.out.println("YES");
		}
		int greatest = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = i; j >= 100; j--) {
				int toTest = i * j;
				if (isPalindrome(toTest) && toTest > greatest) {
					greatest = toTest;
				}
			}
		}
		System.out.println(greatest);
	}

	public static boolean isPalindrome(int input) {
		String s = "" + input;
		return palLogic(s, s.length() - 1, 0);
	}

	public static boolean palLogic(String s, int front, int back) {
		if (back >= front)
			return true;
		if (s.charAt(front) == s.charAt(back)) {
			return palLogic(s, front - 1, back + 1);
		} else {
			return false;
		}
	}
}
