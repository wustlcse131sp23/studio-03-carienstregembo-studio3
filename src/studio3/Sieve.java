package studio3;

import java.util.Scanner; 

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number for the sieve: ");
		int n = in.nextInt();
		
		boolean sieve[] = new boolean [n];
		
		for (int i = 2; i < sieve.length; i++){
			sieve[i] = true;
				for (int k = 2; k < sieve.length/2; k++) {
					for (int j = k*k; j < sieve.length; j+=k) {
						sieve[k] = false;
					}
				}
		}
		for (int i = 0; i < sieve.length; i++){
			if (sieve[i]){
			System.out.println(i);
			}
		}
	}
}



	


