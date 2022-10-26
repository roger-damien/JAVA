package darman.part4;

import java.util.Scanner;

public class Exo4_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entrer les heures\t: ");
		int h=sc.nextInt();
		System.out.printf("Entrer les minutes\t: ");
		int m=sc.nextInt();
		
		if(h==23&&m==59) {
			System.out.printf("Dans une minute il sera minuit");
		}
		else if(m==59) {
			System.out.printf("Dans une minute il sera %d heure(s) 00",++h);
		}
		else {
			System.out.printf("Dans une minute il sera %d heure(s) %d",h,++m);
		}
		
		sc.close();
	}
	
}
