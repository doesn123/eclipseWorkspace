
public class Main {

	public static void main(String[] args) {
		Account a = new Account("12234453", 3400.45, "G's account", "georgehadow@gmail.com", "34098432");
		a.setBalance(34.67);
		System.out.println(a.getBalance());
		a.withdrawAmount(30.00);
		

	}

}
