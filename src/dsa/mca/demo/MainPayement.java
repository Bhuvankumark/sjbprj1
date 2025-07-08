package dsa.mca.demo;

public class MainPayement extends payement {

	@Override
	void pay() {

		System.out.println("Cash payement");
	}
public static void main(String[] args) {
	MainPayement p=new MainPayement();
	p.pay();
	p.printbill();
}
}
