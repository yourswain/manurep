package flyweight;

public class FlyweightMultiplier implements Flyweight {

	
	@Override
	public void doMath(int a, int b) {
		System.out.println("Multiplying " + a + " and " + b + ": " + (a * b));
	}

}