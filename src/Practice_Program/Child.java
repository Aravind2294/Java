package Practice_Program;

public class Child extends Parent {

	@Override
	public void car() {
		super.car();
	}

	public void Sportcar() {
		System.out.println("sports car value high");
	}

	public static void main(String[] args) {

//		Child c = new Child();
//		c.car();
//		c.Sportcar();

//		Child c = new Parent();

		Parent p = new Child();
		p.car();
//		p.Sportcar();

//		A b = new B();
//		b.car();
//		b.Sportcar();
	}
}