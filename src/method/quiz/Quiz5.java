package method.quiz;

public class Quiz5 {
	public static void div(int a, int b) {		
		if (b == 0) {
			System.out.println("나누는 수는 0이 될 수 없다.");
			return;
		}
		
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		div(1, 3);
		div(1, 0);
		div(10, 5);
		div(123, 10);
	}
}
