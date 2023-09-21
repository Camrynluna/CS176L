
public class BankAccount {
	private String account_name;
	private int balance;
	
		public BankAccount() {
			account_name = "Camryn";
			balance = 0;
		}
		public String getName() {
			return account_name;
		}
		public int getBalance() {
			return balance;
		}
		public void deposit(double amount) {
			balance += amount;
		}
		public void withdraw(double amount) {
			balance -= amount;
		}
		
}
