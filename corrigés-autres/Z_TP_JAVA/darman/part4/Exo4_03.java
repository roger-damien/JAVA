package darman.part4;

import java.util.Scanner;

public class Exo4_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Entrer les heures\t: ");
		int h=sc.nextInt();
		System.out.printf("Entrer les minutes\t: ");
		int m=sc.nextInt();
		System.out.printf("Entrer les secondes\t: ");
		int s=sc.nextInt();
		
		if(h==23&&m==59&&s==59) {
			System.out.printf("Dans une seconde il sera minuit");
		}
		else if(m==59&&s==59){
			System.out.printf("Dans une seconde il sera %d heure(s) 0 minute et 0 seconde",++h);
		}
		else if(s==59) {
			System.out.printf("Dans une seconde il sera %d heure(s) %d minute(s) et 0 seconde",h,++m);
		}
		else {
			System.out.printf("Dans une seconde il sera %d heure(s) %d minute(s) %d seconde(s)",h,m,++s);
		}
		
		sc.close();
	}
	
}
