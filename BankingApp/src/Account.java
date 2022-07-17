
public class Account {
	private String number;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public Account(String number, double balance, String name, String email, String phoneNumber) {
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void depositAmount(double depositedAmount) {
		this.balance += depositedAmount;
		System.out.println("new balance: " + this.balance);
	}
	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount <= this.balance) {
			this.balance -= withdrawAmount;
			System.out.println("new balance: " + this.balance);
			System.out.println("withdraw am = " + withdrawAmount);
		} else {
			System.out.println("insufficient funds...");
		}

	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
