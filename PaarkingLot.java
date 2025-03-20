/** Parking lots problem
 * 
 */
package PracticeJava;

import java.util.*;
import java.util.Arrays;
public class ParkingLot {

	public int parking(char[] arr, int n) {
		
		int max = Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<n;i++) {
			
			if(arr[i] == 'S') {
				count++;
				if(max<count) {
					max = count;
				}
			}
			else {
				count=0;
			}
			
		}
		
		return max;
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    ParkingLot pl = new ParkingLot();

	    int n = sc.nextInt();
	    sc.nextLine();  // Consume the newline after integer

	    String inputStr = sc.next();  // Read the whole string of slots
	    char arr[] = inputStr.toCharArray();

	    System.out.print(pl.parking(arr, n));
	}


}
