package PracticeJava;

import java.util.*;
public class BusyBees {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = (arr[i]+arr[j])/2;
				if(sum >= k) {
					System.out.print("("+arr[i]+", "+arr[j]+")  ");
				}
			}
		}
		

	}

}
