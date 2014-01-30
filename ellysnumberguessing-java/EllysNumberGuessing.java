public class EllysNumberGuessing {

	public int getNumber(int[] guesses, int[] answers) {
		//if(guesses.length == answers.length) {
			if(guesses.length == 1) {
				if(guesses[0] - answers[0] <= 0 && guesses[0] + answers[0] < 1000000000) {
					return guesses[0] + answers[0];
				}
				else if(guesses[0] - answers[0] > 0 && guesses[0] + answers[0] >= 1000000000) {
					return guesses[0] - answers[0];
				}
				else if(guesses[0] - answers[0] <= 0 && guesses[0] + answers[0] >= 1000000000){
					return -2;
				}
				else {
					return -1;
				}
			}
			else {//if(guesses.length > 1) {
				int[] ups = new int[guesses.length];
				int[] downs = new int[guesses.length];
				int result = 0;
				for(int i = 0; i < guesses.length; i++) {
					ups[i] = guesses[i] + answers[i];
					downs[i] = guesses[i] - answers[i];
				}
				result = (ups[0] == downs[1] || ups[0] == ups[1])? ups[0]:downs[0]; 
				for(int i = 1; i < guesses.length; i++) {
					if(!(ups[i] == result || downs[i] == result)) {
						return -2;
					}
				}
				return result;
			}
		//}
	}
}
