package sumOFdigit;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
				int maxsum = Integer.MIN_VALUE;
				int minsum = Integer.MAX_VALUE;
				int arr  []  = new int [5];
				for(int i =0;i<5;i++) {
					arr[i] = sc.nextInt();
					
				}
				
				int sum = 0;
				
				for(int i =0;i<5;i++) {
					sum+=arr[i];
				}
				
				
				for(int i =0;i<5;i++) {
					int eachsum =sum-arr[i];
					
					if(eachsum>maxsum) {
						maxsum = eachsum;
					}
					
					if(eachsum<minsum) {
						minsum = eachsum;
					}
				}
				
				System.out.print(maxsum+" "+minsum);
				
				
				
	}

}
