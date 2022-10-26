package darman.part5;

import java.util.Scanner;

public class Exo5_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entre un entier : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
		
		sc.close();
	}
	
}
