//SRM 147 DIV 1 - 350 points
public class PeopleCircle {

	public String order(int numMales, int numFemales, int K) {
		int size = numMales + numFemales;
		char[] results = new char[size];
		int current;
		if(K%size - 1 == -1) {
			current = size - 1;
		}
		else {
			current = K%size - 1;
		}
		// while we still have females
		while(numFemales > 0) {
			// iterate to get the next female spot
			results[current] = 'F';
			numFemales--;
			for(int i = 0; i < K; i++) {
				// but if the current step is already a female add 1, or make 0 if it's end of list
				current++;
				if(current == results.length) {
					current = 0;
				}
				while(results[current] == 'F') {
					current++;
					if(current == results.length) {
						current = 0;
					}
				}
			}
		}
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < results.length; i++) {
			if(results[i] == 'F') {
				result.append('F');
			}
			else {
				result.append('M');
			}
		}
		return result.toString();
	}
}
