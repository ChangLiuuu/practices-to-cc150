
public class URLify {
	// replace all spaces in a string with '%20'
	public static String replaceSpaces(String str, int trueLength) {
		char[] array = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		if (trueLength < array.length) {
			array[trueLength] = '\0';
		} 

		for (int i = 0; i < trueLength; i++) {
			if (array[i] == ' ') {
				sb.append("%20");
			} else {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(replaceSpaces("Mr S M   ", 7));
	}	
}
