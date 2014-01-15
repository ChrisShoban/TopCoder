// SRM 217 DIV 2 - 250 points
public class FuelConsumption {

	public double maximalDistance(int[] velocities, int[] consumptions, int fuel) {
		int size = 0;
		if(velocities.length == consumptions.length) {
			size = velocities.length;
		}
		double bestRatio = 0.0;
		double currentRatio = 0.0;
		for(int i = 0; i < size; i++) {
			currentRatio = (double)velocities[i]/consumptions[i];
			if(currentRatio > bestRatio) {
				bestRatio = currentRatio;
				//bestVelocity = velocities[i];
			}
		}
		return bestRatio * fuel;
	}
	
	public static void main(String[] args) {
		FuelConsumption test = new FuelConsumption();
		test.maximalDistance(new int[]{100}, new int[]{1000}, 1000);
	}

}
