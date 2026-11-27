package p1;

public class Deneme {
	public double doSomething(int pay,int payda) {
		double s =0;
		if (pay>payda)
			throw new ArithmeticException("pay paydadan küçük olmalý");

		return s;
	}
}
