package method.quiz;

public class Quiz6 {
	public static void cal(int a, int b, char ch) {		
		if (ch == '+')
			System.out.println(a + b);
		else if (ch == '-')
			System.out.println(a - b);
		else if (ch == '/' && (b != 0))
			System.out.println(a / b);
		else
			System.out.println(a * b);
	}
	
	public static void main(String[] args) {
		cal(1, 3, '+');
		cal(1, 3, '-');
		cal(1, 3, '/');
		cal(1, 3, '*');
	}
}
