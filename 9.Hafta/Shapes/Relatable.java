package Shapes;

public interface Relatable {
	boolean isLargerThan(Relatable r);
	default void test() {
		System.out.println("test ama�l� default metot");
	}
}
