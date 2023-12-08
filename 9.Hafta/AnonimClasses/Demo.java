package AnonimClasses;

public class Demo {

	
	public static void main(String[] args) {
		HelloWorldAnonymousClasses ac = new HelloWorldAnonymousClasses();
		ac.sayHello(new HelloWorld() {
		
			@Override
			public void greet() {
				System.out.println("çalýþtýýýýýý...");
			}
		});
		
		ac.sayHello(() ->System.out.println("ikinci kez çalýþtýýýýýý..."));
		
	}
}





/*
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }      
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");


 * */
 