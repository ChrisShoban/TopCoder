// SRM 148 DIV 2 - 250 points
public class DivisorDigits {

	public int howMany(int number) {
		String num = number + "";
		int currDigit;
		int[] tenDigits = new int[10]; // 
		for(int i = 0; i < num.length(); i++) {
			currDigit = Character.getNumericValue(num.charAt(i));
			if(currDigit != 0) {
				int mod = number%currDigit;
				if(mod == 0) {
					//System.out.println(currDigit);
					tenDigits[currDigit] = 1;
				}
			}
		}
		int total = 0;
		for(Integer digit : tenDigits) {
			total += digit;
		}
		return total;
	}
}
