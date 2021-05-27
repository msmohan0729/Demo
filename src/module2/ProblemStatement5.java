package module2;

public class ProblemStatement5 {
	int integerValue;
	float floatValue;
	
	public ProblemStatement5() {
	}
	
	ProblemStatement5(int value){
		this.integerValue = value;
		System.out.println("Constructor which accepts integer value which as value : "+this.integerValue);
	}
	
	ProblemStatement5(float value){
		this.floatValue = value;
		System.out.println("Constructor which accepts float value which as value : "+ this.floatValue);
	}
	
	
	public static void main(String[] args) {
		new ProblemStatement5(1234);
		new ProblemStatement5(123.45f);
	}
}
