package darman.part5;

import java.util.Scanner;

public class Exo5_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entre un entier > 0 : ");
		int n=sc.nextInt();
		
		int s=1;
		for(int i=2;i<=n;i++) {
			s*=i;
		}
		System.out.printf("%d! = %d ",n,s);
		
		sc.close();
	}
	
}
