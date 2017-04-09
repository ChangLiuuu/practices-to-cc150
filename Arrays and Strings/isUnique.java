
public class isUnique {
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
	
	public static void main(String[] args) {
		System.out.println(solution("afsdf"));
		System.out.println(solution2("asdf"));
		
	}	
}
