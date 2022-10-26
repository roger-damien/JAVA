package darman.part4;

import java.util.Scanner;

public class Exo4_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Quel est ton age ? ");
		int age=sc.nextInt();
		System.out.printf("Quel est ton sexe (m/f) ? ");
		sc.nextLine();
		char sexe=sc.nextLine().charAt(0);
		
		if((sexe=='m'&&age>=20)||(sexe=='f'&&age>=18&&age<=35)) {
			System.out.printf("Tu dois payer l'impot");
		}
		else {
			System.out.printf("Tu n'as pas d'impot a payer");
		}
		
		sc.close();
	}
	
}
