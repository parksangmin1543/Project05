package hiding.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setModel("소나타");
		car.setTopSpeed(200);
		car.setCompany("현대");
		car.setColor("희색");
		
		System.out.println(car.getCompany() + car.getColor() + car.getTopSpeed() + car.getModel());
	}
}

class Car {
	private String model;
	private int topSpeed;
	private String company;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}