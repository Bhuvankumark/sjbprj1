package dsa.mca.demo;

public class DemoInterface implements Game {

	public static void main(String[] args) {
DemoInterface o=new DemoInterface();
o.move();

	}

	@Override
	public void move() {
System.out.println("moving left");		
	}

}
