public class PowerOfThreeEasy {
	
	public String ableToGet(int x, int y) {
		double[] raisedTo = new double[19];
		for(double i = 0.0; i < 19.0; i++) {
			raisedTo[(int)i] = i;
		}
		// find the lowest power of 3 to get x or y (which ever is lower
		int lowest = 0;
		int low = 0;
		if(x < y) {
			low = y;
			lowest = x;
		}
		else {
			low = x;
			lowest = y;
		}
		int r = 0;
		double lowestPow = 0.0;
		while(r < lowest) {
			r += Math.pow(3.0, lowestPow);
			lowestPow++;
		}
		
		// then find if x is possible with some (more than 1?) powers of 3
		// for the remaining power of 3, is it possible to get y
		return null;
	}
	
	public static void main(String[] args) {
		int c = 3;
		long r = 0;
		for(int i = 0; i < 20; i++) {
			r += Math.pow((double)c, (double)i);
		}
		System.out.println(r);
	}
}
