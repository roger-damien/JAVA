package darman.part4;

import java.util.Scanner;

public class Exo4_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int niv=0;
		String color="Refuse";
		System.out.printf("Age du conducteur : ");
		int age=sc.nextInt();
		System.out.printf("A le permis depuis (en année) : ");
		int perm=sc.nextInt();
		System.out.printf("Nombre d'accidents responsables : ");
		int acc=sc.nextInt();
		System.out.printf("Anciennete : ");
		int anc=sc.nextInt();
		
		if(age>=25)niv++;
		if(perm>=2)niv++;
		niv-=acc;
		
		if(niv>=0) {
			if(anc>=5)niv++;
			if(niv==3)color="Bleu";
			else if(niv==2)color="Vert";
			else if(niv==1)color="Orange";
			else if(niv==0)color="Rouge";
		}
		
		System.out.printf("Contrat : %s",color);
		
		sc.close();
	}
	
}
