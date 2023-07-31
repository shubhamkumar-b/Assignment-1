package test1;

import java.util.Scanner;

public class Q4 {
	
	public static int numberOfJumps(int a[], int n) {
		if(n<=1) 
            return 0;
        if(a[0]==0)
            return -1;
 
        int range = a[0]; 
        int steps = a[0]; 
        int jumpCount = 1; 
 
        for(int i=1;i<n;i++) {
            if(i==(n-1)) 
                return jumpCount;
            range = Math.max(range, i+a[i]); 
            steps--; 
            if(steps==0) { 
                jumpCount++; 
                if(i>=range) 
                    return -1;
                steps = range-i; 
            }
        }
        return -1; 
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
        System.out.println(numberOfJumps(arr, sizeOfArray));

	}

}
