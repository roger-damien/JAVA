package biblio;
import biblio.test.C3;
import java.util.Date;
import java.util.Scanner;
//import java.util.*;
import static java.lang.System.out;
public class MonApp
{
	 public static void main( String [] args )
	 {
		 
		String message = "Hello World";
		System.out.println(message);//kjhkjkj
		/*
		kjlklklk
		jlkjkllk*/
	
		System.out.println(message +   "  les CDA,  il est :" + (new Date()).toString());
		//message = null;
		System.out.println(" la longueur de message" + message.length());
		System.out.println("resultat :" + message.substring(0,3).toUpperCase().toLowerCase());
		
		String chaine2 = new String("Hello World");
		//String chaine2 = "Hello World";

		if( message == chaine2 )
		{
			System.out.println("Ce sont les mêmes objets");
		}
		else
		{
			System.out.println("Ce ne sont pas les mêmes objets");

		}
		
		if( message.equals(chaine2) )
		{
			System.out.println("Ce sont les mêmes chaine de caractères");
		}
		else
		{
			System.out.println("Ce ne sont pas les mêmes chaine de caractères");

		}

		System.out.println(message.equals(chaine2)? "Ce sont les mêmes chaine de caractères":"Ce ne sont pas les mêmes chaine de caractères");

		////////////////////////////////
		//  Saisie au Clavier
		
		java.util.Scanner sc = new Scanner( System.in );
		
		System.out.print("Entrez votre numéro porte bonheur :");
		//int bonheur = sc.nextInt();
		int bonheur =0;
		//String chaine3 = sc.nextLine();
		//int entier2 = sc.nextInt();

		System.out.println();
		
		System.out.println("\nvotre numéro porte bonheur :" + bonheur);
		
		////////////////////////////////////
		//les primitifs
		
		char c;//2 octets   //UTF-16
		c = 'a';
		
		char c2 = '\u0042';//B
		char c3 = '\t';
		//char c4 = 0x0046;//F
		char c4 = 70;//F

		System.out.println("valeur de c : " + c);
		System.out.println("valeur de c2 : " + c2);
		System.out.println("valeur de c3 : " + c3);
		System.out.println("valeur de c4 : " + c4);
		
		System.out.printf("valeur de c4 : %c\n" , c4);

		boolean bo = true;
		//System.out.println("le contraire de valeur de bo : " + !bo);
		System.out.println("valeur de bo : " + bo);

		//nombre entier signés
		
		//byte b = -123; // 1 octets  // -126 à 127
		byte b = 123; // 1 octets  // -126 à 127

		byte b2 = 65;
		
		byte b3 = (byte)(b + b2);
		//int i1 = b + b2;
		
		System.out.println("valeur de b3 : " + b3);

		short s1 = 456; // entier signé sur 2 octets// -32XXX à +32XXX
		
		out.printf("valeur de s1 : %d\n" , s1);

		int i2 = 12345;
		
		long L1 = 123456789999999999L;
		long L2 = (long)12345e3;

		i2 = (int)L1;
		
		out.printf("valeur de i2 : %d , valeur de L1 : %d\n" , i2, L1);
	
		// nombres approximés
		float ff = 12.23F; //4 octets
		ff = (float)12.23;

		System.out.println("valeur de ff : " + ff);
		double dd = 12.34e-12; //8 octets

		int i4 = 5*5;
		i4 = (int)Math.pow(5,2);
		
		float f5 = (float)Math.sqrt(5);
		System.out.println("valeur de f5 : " + f5);
		
		for( int i = 1 ; i < 5; i = i + 1 )
		{
			System.out.println("for valeur de i:" + i);
	
		}
		//for( i = 1 ; i < 5; i ++ )

		////////////////////////////
		// structure de controle alternative (test)
		////////////////////////////
		
		if( i2 <= i4)
		{
			System.out.println("i2 plus grand que i4");
			System.out.println("bonjour");
		}
		
		
		if( i2 == i4)
		{
			System.out.println("Les deux entiers sont égaux");
		}
		else
		{
			System.out.println("Les deux entiers sont différents");
		}

		if( i2 == i4)
		{
			System.out.println("Les deux entiers sont égaux");
		}
		else if (i2 < i4 )
		{
			System.out.println("i2 inférieur à i4");
		}
		else if (i2 > i4 )
		{
			System.out.println("i2 inférieur à i4");
		}
		else 
		{
			System.out.println("i2 supérieur à i4");
			throw new RuntimeException("je ne dois pas passer ici");
			
		}

		switch ( c )
		{
			case 'a':
				System.out.println("c vaut a");
				break;
			case 'i':
			case 'j':
			case 'e':
				System.out.println("c ne vaut pas a");
				break;

			default:
				System.out.println("cas non géré");
				break;
		}
		
		String chaine3 = "good morning";
		switch ( chaine3 )
		{
			case "hello":
				System.out.println("cas hello");
				break;
			case "salut":

				System.out.println("cas salut");
				break;

			default:
				System.out.println("autre");
				break;
		}
		
		
		FeuTricolor feu = FeuTricolor.ORANGE;
		
		switch ( feu )
		{
			case ROUGE:
				System.out.println("je m'arrête");
				break;
			case VERT:

				System.out.println("je passe ");
				break;
			case ORANGE:

				System.out.println("je m'arrête");
				break;

			default:
				System.out.println("autre");
				break;
		}
		
		////////////////////////////////
		// srtucture de controle itérative (boucle, itération)
		
//		while(true)
//		{
//			System.out.println("autre");
//			
//		}
	System.out.println();
		int i7 =0;
		while(i7 < 5)
		{
			System.out.println("while valeur de i7 :" + i7);
			
			i7 = i7 +1;  //i += 1; i++;
		}
	System.out.println();
	
		i7 =0;
		do
		{
			System.out.println("do-while valeur de i7 :" + i7);
			
			i7 = i7 +1;  //i += 1; i++;
		}while(i7 < 5);
	System.out.println();
		
		for( int i=0 ; i < 5 ; i++, i7++)
		{
			System.out.println("for valeur de i :" + i);

			
		}
/*		for(;;)
		{
			System.out.println("boucle infini");
		}*/
		
		i7 =0;
		while(true)
		{

			if( i7== 3)
				break;//return;//break;
			

			i7 = i7 +1;  //i += 1; i++;
			
			if( i7 % 2 == 0)
				continue;

			System.out.println("while2 valeur de i7 :" + i7);
		}
					
		

		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int i12 = C2.addition ( 12, 78);
		System.out.println("résultat de l'addition de 12 + 78 :" + i12);
		
		
				
		System.out.println("résultat de la soustraction de 12 + 78 :" + C3.soustraction ( 12, 78));

		
		
		
		System.out.println("je suis la dernière instruction du main");
	 }//main()
	 
	 enum FeuTricolor{ VERT, ROUGE, ORANGE }


}
class C2{
	
	static int addition( int val1 , int val2 )
	{
		int resultat;
		resultat = val1 + val2;
		return resultat;
	}
}