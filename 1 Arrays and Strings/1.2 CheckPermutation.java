import java.util.Arrays;

public class CheckPermutation {
	//sort the strings
	public static boolean solution(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] array = t.toCharArray();
		Arrays.sort(array);
		char[] array2 = s.toCharArray();
		Arrays.sort(array2);
		//return array.equals(array2); 没有指向同一内存地址
		return Arrays.equals(array, array2);
	}
    
    
	//check if two strings have identical character counts
	public static boolean solution2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] mark = new int[256];
		char[] t_array = t.toCharArray();
		for (char c: t_array) {
			mark[c]++;
		}
		char[] s_array = s.toCharArray();
		for (char m: s_array) {
			mark[m]--;
			if (mark[m] < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abc", "acb"));
		System.out.println(solution2("babc", "acbb"));
	}
}

