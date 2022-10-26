package darman.part5;

import java.util.Scanner;

public class Exo5_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Nombre de chevaux partants : ");
		int start=sc.nextInt();
		System.out.printf("Nombre de chevaux joues : ");
		int play=sc.nextInt();
		
		int x=1,y=1;
		if(play>start) {
			System.out.printf("Tu ne peux pas joues plus de chevaux que de partants");
		}
		else {
			for(int i=1;i<=play;i++) {
				x*=(start-play+i);
				y*=i;
			}
			System.out.printf("Dans l'ordre : une chances sur %d de gagner\nDans le desordre : une chances sur %d de gagner",x,x/y);
		}
		sc.close();
	}

}
