
public class salePrice {

	public static void main(String[] args) {
		double percentOff = 0.34;
		System.out.println("Sale price: " + Discount(520));

	}
	
	public static double Discount(double origPrice) {
		return percentOff * origPrice;
	}
}
