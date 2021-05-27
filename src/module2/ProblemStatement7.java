package module2;

public class ProblemStatement7 {
	public ProblemStatement7() {
		multiplesOfNumbers(1);
		multiplesOfNumbers(2);
		multiplesOfNumbers(3);
		multiplesOfNumbers(4);
		multiplesOfNumbers(5);
	}
	
	public static void multiplesOfNumbers(int number) {
		System.out.println();
		System.out.println("First 10 multiples of "+number+" : ");
		for(int i=1; i<=10; i++) {
			System.out.println(i*number);
		}
	}
	
	public static void main(String[] args) {
		new ProblemStatement7();
	}
}
