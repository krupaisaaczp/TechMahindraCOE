package PracticeJava;
import java.util.Arrays;
import java.util.*;

public class ChocolateProblem {
	public static int Chocolate(int[] arr, int n, int m) {
		if(m == 0 || n == 0 || m>n) return 0;
		
		int min = Integer.MAX_VALUE;
		int diff = 0;
		
		for(int i = 0; i + m -1 < n; i++) {
			diff = arr[i+m-1] - arr[i];
			if(min > diff) {
				min = diff;
			}
		}
		return min;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ChocolateProblem cp = new ChocolateProblem();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();		
		}
		System.out.println("next length of subarray");
		int m = sc.nextInt();
		
		Arrays.sort(arr);
		
		
		System.out.println(cp.Chocolate(arr, n, m));
	}
}
