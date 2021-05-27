package module2;

class Multiple1 {
	public void multiple(int value1 , int value2) {
		System.out.println("Multiple of "+value1+" and "+value2+ " is "+ (value1*value2));
		System.out.println();
	}
}

public class Additions extends Multiple1{
	@Override
	public void multiple(int value1, int value2) {
		System.out.println("Addition of "+value1+" and "+value2+ " is "+ (value1+value2));
	}
	
	public static void main(String[] args) {
		Additions add = new Additions();
		add.multiple(5,2);
	}
}
