package hiding.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();
		
		book.setTitle("자바프로그래밍");
		book.setPrice(20000);
		book.setCompany("한빛컴퍼니");
		book.setPage(300);
		
		System.out.println(book.getCompany() + book.getPage() + book.getPrice() + book.getTitle());

		book1.setTitle("스프링");
		book1.setPrice(15000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(500);
		
		System.out.println(book1.getCompany() + book1.getPage() + book1.getPrice() + book1.getTitle());
	}
}

class Book {
	private String title;
	private int price;
	private String company;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}