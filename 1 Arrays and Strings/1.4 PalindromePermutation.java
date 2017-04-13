
public class PalindromePermutation {
	//judge based on the length odd or even
	public static boolean solution(String s) {
		char[] array = new char[256];
		int oddCount = 0;
		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i)]++;
		}
		for (int j = 0; j < s.length(); j++) {
			if (s.length() % 2 == 0) {
				//even
				if (array[s.charAt(j)] % 2 != 0) {
					return false;
				}
			} else {
				//odd
				if (oddCount > 1) {
					return false;
				}
				if (array[s.charAt(j)] % 2 != 0) {
					oddCount++;
				}
			} 
		}
		return true;
	}
	
	//record the odd count of each letter
	public static boolean solution2(String s) {
		char[] array = new char[256];
		int oddCount = 0;
		for (int i = 0; i < s.length(); i++) {
			array[s.charAt(i)]++;
		}
		for (int j = 0; j < s.length(); j++) {
			if (array[s.charAt(j)] % 2 == 1) {
				oddCount++;
			}
		}
		return oddCount <= 1;
	}
	public static void main(String[] args) {
		System.out.println(solution("googleela"));
		System.out.println(solution2("googleelab"));
	}
}
