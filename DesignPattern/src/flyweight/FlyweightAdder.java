package flyweight;

public class FlyweightAdder implements Flyweight {

	@Override
	public void doMath(int a, int b) {
		System.out.println("Add " + a + " and " + b + ": " + (a + b));
	}

}