import java.util.Arrays;

public class EllysSubstringSorter {

	public String getMin(String S, int L) {
			char curr;
			boolean breakCondition = false;
			int i = 0;
			while(i < S.length() - L) {
				curr = S.charAt(i);
				for(int j = i + 1; j < i + L; j++) {
					if(curr > S.charAt(j)) {
						breakCondition = true;
						break;
					}
				}
				if(breakCondition) {
					breakCondition = false;
					break;
				}
				i++;
			}
			
			String left = (i>0)?S.substring(0, i):"";
			String middle = S.substring(i, i + L);
			char[] sorted = middle.toCharArray();
			Arrays.sort(sorted);
			String right = (i + L == S.length()) ? "":S.substring(i + L);
			StringBuffer result = new StringBuffer();
			result.append(left);
			for(char letter : sorted) {
				result.append(letter);
			}
			result.append(right);
		return result.toString();
	}
}
