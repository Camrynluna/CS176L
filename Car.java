
public class Car {
	double fuel;
	double amountInTank;
	
	public Car(double mpg) {
		amountInTank = 0;
		fuel = mpg;
	}
	public void addGas(double gallons) {
		amountInTank += gallons;
	}
	public double getTank() {
		return fuel;
	}
	public void drive(double fuelUsage) {
		fuel -= (fuel / fuelUsage);
	}
}
