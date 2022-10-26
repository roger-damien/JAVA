package darman.part3;

import java.util.Scanner;

public class Exo3_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Quel est l'age de l'enfant ? ");
		int age=sc.nextInt();
		
		if(age < 6) {
			System.out.printf("Trop jeune");
		}
		else if(age<=7) {
			System.out.printf("Categorie : Poussin");
		}
		else if(age<=9) {
			System.out.printf("Categorie : Pupille");
		}
		else if(age<=11) {
			System.out.printf("Categorie : Minime");
		}
		else {
			System.out.printf("Categorie : Cadet");
		}
		
		// Peut-on concevoir plusieurs algorithmes équivalents menant à ce résultat ? OUI
		
		sc.close();
	}
	
}
