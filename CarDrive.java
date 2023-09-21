
public class CarDrive {
	public static void main(String[] args) {
		Car myHybrid = new Car(50);
		
		myHybrid.addGas(20);
		System.out.println(myHybrid.getTank());
		myHybrid.drive(100);
		System.out.println(myHybrid.getTank());
		
	}

}
