// SRM 195 DIV 2 - 250
public class Rounder {

	public int round(int n, int b) {
		if(n%b < (float)b/2) {
			return n - (n%b);
		}
		else{
			return n + (b - (n%b));
		}
		
		// return (n%b < (float)b/2) ? (n - (n%b)) : (n + (b - (n%b))) d;
	}
}
