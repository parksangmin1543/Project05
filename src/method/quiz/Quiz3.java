package method.quiz;

public class Quiz3 {
	public static void comp(int a, int b) {
		if (a < b)
			System.out.println(b);
		else
			System.out.println(a);
	}

	public static void main(String[] args) {
		comp(10, 3);
		comp(100, 200);
		comp(102134, 32134);
		comp(1034, 32134);
	}
}
