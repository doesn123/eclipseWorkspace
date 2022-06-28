package getPrimes2;

import java.util.ArrayList;

public class getP {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			System.out.println(findPrimes(5));
		}
//		System.out.println(findPrimes(1,10000));

	}

	public static ArrayList<Integer> findPrimes(int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int start = 0;
		for(int n = start; n < end; n++) {
			boolean isPrime = true;
			int i = 2;
			while(i <= n/2) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime) {
				primes.add(n);
			}
		}

		return primes;
		
	}

}
