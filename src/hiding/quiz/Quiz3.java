package hiding.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		Mydate date = new Mydate();
		
		date.setMonth(8);
		date.setMonth(13);
	}
	
	static class Mydate {
		private int month;
		
		public int getMonth() {
			return month;
		}
		
		public void setMonth(int month) {
			if (month > 1 && month < 12)
				this.month = month;
			else
				System.out.println(month + "x");
		}
	}
}
