package darman.part2;

import java.util.Scanner;


public class Exo2_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String prenom;
		
		System.out.println("Quel est votre prenom ? ");
        prenom=sc.nextLine();
        System.out.printf("Bonjour, %s !",prenom);
        
        sc.close();
	}

}
