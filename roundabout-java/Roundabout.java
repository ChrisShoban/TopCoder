import java.util.Arrays;

public class Roundabout {

	public int clearUpTime(String north, String east, String south, String west) {
		
		String all = north + east + south + west;
		if(isEmpty(all.toCharArray())) 
			return 0;
		
		char empty = '-';

		char[] roundAbout = {empty, empty, empty, empty, empty}; // 5 for temp for roll around
		
		// for the Round About itself
		int n = 0, e = 1, s = 2, w = 3;
		
		boolean isDeadlock = false;
		
		// for each String passed above 
		int enteringN = 0, enteringE = 0, enteringS = 0, enteringW = 0;
		
		boolean mayEnterN = false, mayEnterE = false, mayEnterS = false, mayEnterW = false;
		
		int totalTime = 0;
		
		while(enteringN < north.length() || 
			  enteringE < east.length() || 
			  enteringS < south.length() || 
			  enteringW < west.length() ||
			  !isEmpty(roundAbout)) { //&&
			   //notEmpty(pointers, north, east, south, west)) {
			
			// TODO FIX check for size out of bounds and build massive string to test
			if(isEmpty(makeString(enteringN, north, enteringE, east, enteringS, south, enteringW, west, roundAbout).toCharArray())) {
				System.out.println("empty");
				return totalTime;
			}
			System.out.println(makeString(enteringN, north, enteringE, east, enteringS, south, enteringW, west, roundAbout));
			//	return totalTime + 1;

			System.out.println("Time: " + totalTime);
			System.out.println(Arrays.toString(roundAbout) + " - Time Updated");

			// Check no deadlock (all 4 are waiting)
			if((enteringN < north.length() && north.charAt(enteringN) != empty) && 
			   (enteringE < east.length()  &&  east.charAt(enteringE) != empty) &&
			   (enteringS < south.length() && south.charAt(enteringS) != empty) &&
			   (enteringW < west.length()  &&  west.charAt(enteringW) != empty)) {
				isDeadlock = true;
			}
			else {
				isDeadlock = false;
			}
				
			// Check, can I move enter or do I have to wait?
			mayEnterW =  (enteringW < west.length()  && clearFrom(enteringN, north, roundAbout, n));
			mayEnterS =  (enteringS < south.length() && clearFrom(enteringW, west,  roundAbout, w));
			mayEnterE =  (enteringE < east.length()  && clearFrom(enteringS, south, roundAbout, s)); 
			mayEnterN = ((enteringN < north.length() && clearFrom(enteringE, east,  roundAbout, e)) || (isDeadlock && roundAbout[e] == empty)); 
		
			// This helper function is good for shifting or exiting from the round about
			shiftOrExit(roundAbout);
			
			System.out.println(Arrays.toString(roundAbout) + " - Just Shifted");
			// Enter Round About and Update pointer for front, or just wait and do nothing
			
			// helper function to set round about
			roundAbout[n] = (mayEnterN) ? north.charAt(enteringN) : roundAbout[n];
			roundAbout[e] = (mayEnterE) ?  east.charAt(enteringE) : roundAbout[e];
			roundAbout[s] = (mayEnterS) ? south.charAt(enteringS) : roundAbout[s];
			roundAbout[w] = (mayEnterW) ?  west.charAt(enteringW) : roundAbout[w]; 
				
			System.out.println(Arrays.toString(roundAbout) + " - Just Entered");
			// helper function to set pointer for each string
			
			enteringN += (mayEnterN || (enteringN < north.length() && north.charAt(enteringN) == empty)) ? 1 : 0;
			enteringE += (mayEnterE || (enteringE < east.length()  &&  east.charAt(enteringE) == empty)) ? 1 : 0;
			enteringS += (mayEnterS || (enteringS < south.length() && south.charAt(enteringS) == empty)) ? 1 : 0; 
			enteringW += (mayEnterW || (enteringW < west.length()  &&  west.charAt(enteringW) == empty)) ? 1 : 0; 
			 
			while(enteringN < north.length() && north.charAt(enteringN) == empty && enteringN <= totalTime)
				enteringN++;
			while(enteringE < east.length()  &&  east.charAt(enteringE) == empty && enteringE <= totalTime)
				enteringE++;
			while(enteringS < south.length() && south.charAt(enteringS) == empty && enteringS <= totalTime)
				enteringS++;
			while(enteringW < west.length()  &&  west.charAt(enteringW) == empty && enteringW <= totalTime)
				enteringW++;		
			
			totalTime++;
		}
		return totalTime;
	}

	private String makeString(int enteringN, String north, int enteringE,
			String east, int enteringS, String south, int enteringW,
			String west, char[] roundAbout) {
		String result = "";
		result += (enteringN < north.length()) ? north.substring(enteringN) : ""; 
		result += (enteringE < east.length())  ? east.substring(enteringE)  : "";
		result += (enteringS < south.length()) ? south.substring(enteringS) : "";
		result += (enteringW < west.length())  ? west.substring(enteringW)  : "";
		for(Character c : roundAbout) {
			result += c;
		}
		return result;
	}

	private boolean isEmpty(char[] roundAbout) {
		for(Character car : roundAbout) {
			if(car != '-') {
				return false;
			}
		}
		return true;
	}

	private boolean clearFrom(int entering, String input, char[] roundAbout, int num) {
		boolean a = entering >= input.length();
		boolean b = false;
		if(!a) {
			b = input.charAt(entering) == '-';
		}
		boolean c = roundAbout[num] == '-';

		return ((a || b) && (c));
	}

	private void shiftOrExit(char[] roundAbout) {	
		// for the round About itself
		int n = 0;
		int e = 1;
		int s = 2;
		int w = 3;
		int temp = 4;
		char empty = '-';
		
		if(roundAbout[n] != 'N')  // shift 
			roundAbout[temp] = roundAbout[n];
		roundAbout[n] = empty;  // or leave to be over written
		if(roundAbout[e] != 'E')  // shift or leave to be over written
			roundAbout[e-1]  = roundAbout[e];
		roundAbout[e] = empty; // or leave to be over written
		if(roundAbout[s] != 'S') // shift or leave to be over written
			roundAbout[s-1]  = roundAbout[s]; 
		roundAbout[s] = empty; // or leave to be over written
		if(roundAbout[w] != 'W') // shift or leave to be over written
			roundAbout[w-1]  = roundAbout[w]; // or leave to be over written
		roundAbout[w] = roundAbout[temp]; // or leave to be over written
		roundAbout[temp] = empty;
	}
}