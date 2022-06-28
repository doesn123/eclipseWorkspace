package getPrimes;

import java.util.ArrayList;

public class Primes {

	public static void main(String[] args) {
		findPrimes(1, 500);

	}

	public static ArrayList<Integer> findPrimes(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int n = 353;
		boolean isPrime = true;
		int i = 2;
		while(i <= n/2) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		System.out.println(isPrime);
		return null;
	}
}
