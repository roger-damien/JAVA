package darman.part3;

import java.util.Scanner;

public class Exo3_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nom1,nom2,nom3;
		System.out.printf("Entre un premier nom\t: ");
        nom1=sc.nextLine();
        System.out.printf("Entre un deuxieme nom\t: ");
        nom2=sc.nextLine();
        System.out.printf("Entre un troisieme nom\t: ");
        nom3=sc.nextLine();
        
        if(nom1.compareToIgnoreCase(nom2)<0 && nom2.compareToIgnoreCase(nom3)<0) {
        	System.out.printf("Les noms sont rangés par ordre alphabetique");
        }
        else {
        	System.out.printf("Les noms ne sont pas rangés");
        }
        
        sc.close();
	}
	
}
