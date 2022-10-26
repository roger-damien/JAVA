package darman.part5;

import java.util.Scanner;

public class Exo5_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entre un entier : ");
		int n=sc.nextInt();
		
		int s=1;
		while(s<=10) {
			System.out.printf("%d  ",n+s);
			s++;
		}
		
		sc.close();
	}
	
}
