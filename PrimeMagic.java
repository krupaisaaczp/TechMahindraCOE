package PracticeJava;

import java.util.*;

import java.util.Arrays;

public class PrimeMagic {
	public void prime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		int arr[] = new int[count];
		int m =0;
		
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) arr[m++] = i;
		}
		
		int sum = 0;
		int cnt=0;
		for(int i = 0; i < count; i++) {
		    sum += arr[i];
		    if(sum > n) {
		        break;  // Stop if sum exceeds N
		    }
		    if(isPrime(sum)) {
		        cnt++;
		    }
		}

		
	}
	public static Boolean isPrime(int n) {
		int count = 0;

	     
	     if (n < 2)
	       return false;

	     
	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }

	     
	     return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeMagic pm = new PrimeMagic();
		int N = sc.nextInt();
		pm.prime(N);

	}

}
