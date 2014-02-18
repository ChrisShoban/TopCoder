import java.util.ArrayList;
import java.util.HashMap;

	// SRM 606 - 500 points
public class EllysNumberGuessing {

	public int getNumber(int[] guesses, int[] answers) {
		//if(guesses.length == answers.length) {
		
		int upperBound = 1000000000;
		int lowerBound = 1;
		
		HashMap<Integer, Integer> upsAndDowns = new HashMap<Integer, Integer>();
		
		int up;
		int down;
		int count = 0;
		int largest = 1;
		for(int i = 0; i < guesses.length; i++) {
			up = guesses[i] + answers[i];
			down = guesses[i] - answers[i];
			if(upsAndDowns.get(up) == null && up <= upperBound) {
				upsAndDowns.put(up, 1);
			}
			else if(up <= upperBound){
				count = upsAndDowns.get(up) + 1;
				if (largest < count) largest = count;
				upsAndDowns.put(up, count);
			}
			if(upsAndDowns.get(down) == null && down >= lowerBound) {
				upsAndDowns.put(down, 1);
			}
			else if(down >= lowerBound){
				count = upsAndDowns.get(down) + 1;
				if (largest < count) largest = count;
				upsAndDowns.put(down, count);
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(Integer key : upsAndDowns.keySet()) {
			if(upsAndDowns.get(key) == largest) {
				result.add(key);
			}
		}
		if(largest == guesses.length && result.size() == 1) {
			return result.remove(0); // 1 result matching the length of all the guesses within bounds
		}
		else if(largest == guesses.length && result.size() == 2) {
			return -1; // exactly 2 result preventing us from knowing the actual length 
		}
		else {
			return -2; //
		}
		/*
		if(guesses.length == 1) {
				if(guesses[0] - answers[0] <= lowerBound && guesses[0] + answers[0] < upperBound) {
					return guesses[0] + answers[0];
				}
				else if(guesses[0] - answers[0] > lowerBound && guesses[0] + answers[0] >= upperBound) {
					return guesses[0] - answers[0];
				}
				else if(guesses[0] - answers[0] <= 0 && guesses[0] + answers[0] >= upperBound){
					return -2;
				}
				else {
					// Not enough info to make a guess
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
				int firstGuess = guesses[0];
				int firstAnswer = answers[0];
				boolean changed = false;
				for(int i = 1; i < guesses.length; i++) {
					if(guesses[i] != firstGuess && answers[i] != firstAnswer) {
						changed = true;
						break;
					}
				}
				if(!changed) {
					return -1;
				}
				if(result > 1000000000 || result < 1) {
					result = -2;
				}
				return result;
			}
			*/
		//}
	}
}
