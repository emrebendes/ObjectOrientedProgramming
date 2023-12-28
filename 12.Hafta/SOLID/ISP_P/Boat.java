package ISP_P;

public class Boat implements Vehicle {

	@Override
	public void drive() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void sail() {
		System.out.println("Boat sails");
	}

}
