package darman.part5;

import java.util.Scanner;

public class Exo5_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entre un entier : ");
		int n=sc.nextInt();
		
		for(int i=n+1;i<=n+10;i++) {
			System.out.printf("%d  ",i);
		}
		
		sc.close();
	}
	
}
