import java.util.Arrays;

public class IsUnique {
	
	public static boolean solution(String s) {
		boolean[] array = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (array[val]) {
				return false;
			}
			array[val] = true; //mark 
		}
		return true;
	}
	
	public static boolean solution2(String s) {
		int[] mark = new int[256];
		for (int i = 0; i < s.length(); i++) {
			mark[s.charAt(i)]++;
			if (mark[s.charAt(i)] > 1) {
				return false;
			}
		}
		return true;
	}
	
	// sort then check neighboring characters
	public static boolean solution3(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		for (int i = 1; i < s.length(); i++) {
			if (array[i] == array[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("afsdf"));
		System.out.println(solution2("asdf"));
		System.out.println(solution3("asdfa"));
	}	
}
