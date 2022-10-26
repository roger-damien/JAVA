package darman.part4;

import java.util.Scanner;

public class Exo4_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean err=true;
		
		System.out.printf("Jour\t: ");
		int d=sc.nextInt();
		System.out.printf("Mois\t: ");
		int m=sc.nextInt();
		System.out.printf("Annee\t: ");
		int y=sc.nextInt();
		
		int bi= y%4==0&&(y%100!=0||y%400==0)?1:0; // == [int bi= y%400==0||(y%100!=0&&y%4==0)?1:0;]
		
		if(m>=1&&m<=12&&d>=1) {
			if(m==2&&d<=28+bi)err=false;
			else if((m==4||m==6||m==9||m==11)&&d<=30)err=false;
			else if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d<=31)err=false;
		}
		// if((m>=1&&m<=12&&d>=1)&&((m==2&&d<=28+bi)||((m==4||m==6||m==9||m==11)&&d<=30)||((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d<=31)))err=false;
		
		if(!err) {
			System.out.printf("La date est valide");
		}
		else {
			System.out.printf("La date n'est pas valide");
		}
		
		sc.close();
	}
	
}
