
public class BankValues {

	public static void main(String[] args) {
		BankAccount Camryn = new BankAccount();
		System.out.println(Camryn.getName());
		System.out.println(Camryn.getBalance());
		Camryn.deposit(2000);
		System.out.println(Camryn.getBalance());
		Camryn.withdraw(1000);
		System.out.println(Camryn.getBalance());
	}
}
