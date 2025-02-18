package method.quiz;

public class Quiz7 {
	public static void cal(int a) {
		int temp = 100;
		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += a / temp;
			a %= temp;
			temp /= 10;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		cal(932);
		cal(123);
		cal(467);
	}
}
