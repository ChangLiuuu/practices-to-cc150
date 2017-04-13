
public class OneAway {
	// given two strings, write a function to check if they are one
	// edit(or zero edit) away. (insert/remove/replace a character)
	public boolean solution(String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		
		String str1 = s1.length() > s2.length() ? s1 : s2;
		String str2 = s1.length() > s2.length() ? s2 : s1;
		int index1 = 0, index2 = 0;
		boolean foundDifference = false;
        while (str1.length() > index1 && str2.length() > index2) {
        	if (str1.charAt(index1) != str2.charAt(index2)) {
        		if (foundDifference) {
        			return false;
        		}
        		foundDifference = true;
        		
        		if (s1.length() == s2.length()) {
        			index2++;
        		}
        	} else {
        		index2++;
        	}
        	index1++;
        }
		return true;
	}

}
