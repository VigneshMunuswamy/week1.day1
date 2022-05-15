package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Brakes are appplied");
	}
	public void applyGear() {
		System.out.println("Gear is shifted");
	}
	public void switchonAc() {
		System.out.println("AC is switched on");
	}
	public void applyAcclerate() {
		System.out.println("Accleration is applied");
	}
	
	public static void main(String[] args) {
		Car santro = new Car();
		santro.applyBreak();
		santro.applyAcclerate();
		santro.applyBreak();
		santro.switchonAc();
		santro.applyGear();
	}
}
