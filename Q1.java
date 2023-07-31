package test1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z= new Scanner(System.in);
		System.out.println("Enter a starting distance between 5k to 8km : ");
		int distance = z.nextInt();
		boolean flag=true;
		while(flag) {
			if(distance<5) {
				System.out.println("Sorry, Choose between 5km to 8km : ");
				System.out.println("Enter a starting distance between 5k to 8km : ");
				distance = z.nextInt();
				flag=true;
			} else if(distance>8) {
				System.out.println("Sorry, Choose between 5km to 8km : ");
				System.out.println("Enter a starting distance between 5k to 8km : ");
				distance = z.nextInt();
				flag=true;
			}else {
				for(int i=distance;i>0;i--) {
					System.out.println("Distance to run: " + i);
					if(i==(distance-1)) {
						System.out.println("Good Start, keep it up.");
					}else if(i<3) {
						System.out.println("Almost There: ");
					}else if(i==1) {
						System.out.println();
					}
				}
				System.out.println("Done for the day!");
				flag=false;
			}
		}
	}

}
