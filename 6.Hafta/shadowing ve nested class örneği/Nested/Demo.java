package Nested;

public class Demo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass(10);
		
		OuterClass.InnerClass innerClass =outerClass.new InnerClass(20);
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass(30);
		outerClass.display();
	}
	
}
