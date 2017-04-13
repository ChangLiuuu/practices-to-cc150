
public class URLify {
	// replace all spaces in a string with '%20'
	public static String replaceSpaces(String str, int trueLength) {
		char[] array = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < trueLength; i++) {
			if (array[i] == ' ') {
				sb.append("%20");
			} else {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}
	
	public static String repleaceSpaces2(String str, int trueLength) {
		char[] array = str.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++) {
			if (array[i] == ' ') {
				spaceCount++;
			}
		}
		char[] res = new char[array.length + spaceCount * 2];
		int index = res.length - 1;
		for (int i = trueLength - 1; i >= 0; i--) {
			if (array[i] == ' ') {
				res[index] = '0';
				res[index - 1] = '2';
				res[index - 2] = '%';
				index = index - 3;
			} else {
				res[index] = array[i];
				index--;
			}
		}
		return new String(res);
	}
	public static void main(String[] args) {
		System.out.println(replaceSpaces("Mr S M   ", 7));
		System.out.println(repleaceSpaces2("Mr S M   ", 6));
	}	
}
