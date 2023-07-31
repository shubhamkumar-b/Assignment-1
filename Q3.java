package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	
	public static boolean splitTreasure(int a[], int n) {
		Arrays.sort(a);
		int leftSum = 0, rightSum = a[n-1];
		boolean flag = false;
		for(int i=0, j=n-2;i<n;) { 
			leftSum+= a[i];
			if(leftSum<rightSum) {
				i++;
				if(i>j)
					break;
			}else if(leftSum>rightSum) {
				rightSum+= a[j];
				j--;
			}else if(leftSum==rightSum) {
				flag=true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
    	System.out.println("Enter the size of the array: ");
    	int sizeOfArray = z.nextInt();
    	int arr[] = new int[sizeOfArray];
    	for(int i=0; i<sizeOfArray;i++) {
    		arr[i] = z.nextInt();
    	}
        System.out.println(splitTreasure(arr, sizeOfArray));

	}

}
