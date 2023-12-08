package Shapes;

public interface Relatable {
	boolean isLargerThan(Relatable r);
	default void test() {
		System.out.println("test amaçlý default metot");
	}
}
