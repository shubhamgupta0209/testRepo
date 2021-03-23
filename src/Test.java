
class A {
	void m1() {
		System.out.println("I m m1");
	}
}

class B extends A {
	void m2() {
		System.out.println("I m m2");
	}

	void m1(int a) {
		System.out.println("I m B.m1");
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m1();

		B b = new B();
		b.m1();

		A b1 = new B();
		b1.m1();
		
		System.out.println(System.getProperty("java.version"));

	}

}
