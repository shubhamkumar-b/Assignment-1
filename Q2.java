package test1;

import java.util.Scanner;

public class Q2 { // { -2, -3, 4, -1, -2, 1, 5, -3}
	              // { -3, -3, -2, -2, -1, 1, 4, 5}
	              // { -3, 5, -3, 4, -2, 1, -2, -1}

	public static int profitAndLossSum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<=n-1;i++) {
            int currSum = 0;
            for (int j=i;j<=n-1;j++) {
	            currSum += arr[j];
	            if (currSum>maxSum) {
	                maxSum=currSum;
	            }
            }
        }
        return maxSum;
    }
    public static void main(String args[]) {
        // Your code goes here
    	Scanner z = new Scanner(System.in);
    	System.out.println("Enter the size of the array: ");
    	int sizeOfArray = z.nextInt();
    	int a[] = new int[sizeOfArray];
    	for(int i=0; i<sizeOfArray;i++) {
    		a[i] = z.nextInt();
    	}
        System.out.println(profitAndLossSum(a, sizeOfArray));
    }

}
