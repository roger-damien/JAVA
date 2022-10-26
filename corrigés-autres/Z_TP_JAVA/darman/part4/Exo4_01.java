package darman.part4;

import java.util.Scanner;

public class Exo4_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("tutu (nombre) : ");
		int tutu=sc.nextInt();
		int tutu2=tutu;
		
		System.out.printf("toto (nombre) : ");
		int toto=sc.nextInt();
		System.out.printf("tata (mot) : ");
		sc.nextLine();
		String tata=sc.nextLine();
		
		System.out.printf("\nAlgorithme initial\n");
		if(tutu>toto+4 || tata.equals("OK")) {
			tutu++;
		}
		else {
			tutu--;
		}
		System.out.printf("tutu : %d",tutu);
		
		tutu=tutu2;
		System.out.printf("\n\nAlgorithme alternatif\n");
		if(tutu<=toto+4 && !tata.equals("OK")) {
			tutu--;
		}
		else {
			tutu++;
		}
		System.out.printf("tutu : %d",tutu);
		
		sc.close();
	}
	
}
