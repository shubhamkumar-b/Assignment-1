package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	
	public static void bubbleSort(String a[], int n) {
		 int i, j;
		 String temp = "";
	     boolean swapped;
	     for(i=0;i<n-1;i++){
	         swapped = false;
	            for(j=0;j<n-i-1;j++){
	                if((a[j].compareToIgnoreCase(a[j+1]))>0){
	                    temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                    swapped = true;
	                }
	            }
	        if(swapped==false)
	            break;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z= new Scanner(System.in);
		int sizeOfArray = z.nextInt();
		String[] arr = new String[sizeOfArray];
		z.nextLine();
		for(int i=0;i<sizeOfArray;i++) {
			arr[i] = z.nextLine();
		}
		bubbleSort(arr, sizeOfArray);
		System.out.println("Scenario 1: ");
		for(int i=0;i<sizeOfArray;i++) {
			System.out.println(arr[i]);
		}
//		arr[0].
//		Arrays.sort(arr);
//		System.out.println("Scenario 2: ");
//		for(int i=0;i<sizeOfArray;i++) {
//			System.out.println(arr[i]);
//		}
	}
}
