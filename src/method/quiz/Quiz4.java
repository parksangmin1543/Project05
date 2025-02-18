package method.quiz;

public class Quiz4 {
	public static void minus(int a, int b) {		
		if (a < b) {
			System.out.println(-999);
			return;
		}
		
		System.out.println(a - b);
	}
	
	public static void main(String[] args) {
		minus(1, 3);
		minus(1234, 3234);
		minus(1214214, 3214);
		minus(92142134, 32134124);
	}
}
