// SRM 149 DIV 2 - 250 points
public class FormatAmt {

	public String amount(int dollars, int cents) {
		StringBuffer amount = new StringBuffer();
		int distanceBetweenCommas = 3;
		amount.append(dollars);
		int len = amount.length();
		int commaIndex = len - distanceBetweenCommas;
		while(len > distanceBetweenCommas) {
			amount.insert(commaIndex, ",");
			commaIndex -= distanceBetweenCommas;
			len -= distanceBetweenCommas;
		}
		amount.insert(0, "$");
		amount.insert(amount.length(), ".");
		if(cents < 10) {
			amount.append("0");
		}
		amount.append(cents);
		return amount.toString();
	}

}
