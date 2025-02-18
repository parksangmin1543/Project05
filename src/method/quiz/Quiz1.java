package method.quiz;

public class Quiz1 {
	public static void sum(int a, int b) {
		int total = 0;
		
		if (a > b) {
			System.out.println("error");
			return;
		}
		
		for (int i = a; i <= b; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		sum(1, 3);
		sum(3, 5);
		sum(5, 3);
	}
}
