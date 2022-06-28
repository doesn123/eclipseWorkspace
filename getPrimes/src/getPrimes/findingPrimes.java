package getPrimes;

import java.util.ArrayList;

public class findingPrimes {

	public static void main(String[] args) {
		findPrimes();

	}
	
	public static ArrayList<Integer> findPrimes() {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int n = 10;
		int i = 2;
		boolean prime = true;
		while(i <= n/2) {
			if(n % i == 0) {
				prime = false;
				break;
			}
			i++;
		}
		System.out.println(prime);
		return null;
	}

}
