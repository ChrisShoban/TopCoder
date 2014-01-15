public class FoxAndWord {

	public int howManyPairs(String[] words) {
		int count = 0;
		String word = "";
		String compWord = "";
		for(int i = 0; i < words.length; i++) {
			for(int j = i+1; j <words.length;j++) {
				word = words[i];
				compWord = words[j];
				for(int k = 0; k < word.length(); k++) {
					word = word.charAt(word.length() - 1) + word.substring(0, word.length() - 1);
					if(word.equals(compWord)) {
						count++;
						break;
					}	
				}
			}
		}
		return count;
	}
}
