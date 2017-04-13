// aabcccccaaa   =>  a2b1c5a3  output the string with less length
public class StringCompression {
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
//			if (i != s.length() - 1 && s.charAt(i) != s.charAt(i + 1)) {
//				sb.append(s.charAt(i)).append(count);
//				count = 0;
//			}
//			if (i == s.length() - 1) {
//				sb.append(s.charAt(i)).append(count);
//			}
			
			if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i)).append(count);
				count = 0;
			}
		}
		return sb.length() < s.length() ? sb.toString() : s;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("aabcccccaaa"));
		System.out.println(solution("acvfdss"));
	}
}
