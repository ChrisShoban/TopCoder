// SRM 154 - DIV 2 - 450 Points
public class SuperRot {

	public String decoder(String message) {
		if(message == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		int shift = 0;
		char letter;
		for(int i = 0; i < message.length(); i++) {
			letter = message.charAt(i);
			if(letter != ' ') {
				if('A' <= letter && letter <= 'Z') {
					shift = (letter >= 'N') ? letter - 'N' : letter - 'A';
					letter = (letter >= 'N') ? (char)('A' + shift) : (char)('N' + shift);
				}
				else if('a' <= letter && letter <= 'z') {
					shift = (letter >= 'n') ? letter - 'n' : letter - 'a';
					letter = (letter >= 'n') ? (char)('a' + shift) : (char)('n' + shift);
				}
				else if('0' <= letter && letter <= '9') {
					shift = (letter >= '5') ? letter - '5' : letter - '0';
					letter = (letter >= '5') ? (char)('0' + shift) : (char)('5' + shift);
				}
				
			}
			result.append(letter);
				
		}
		return result.toString();
	}

}
