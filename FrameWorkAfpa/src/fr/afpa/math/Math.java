package fr.afpa.math;

import java.math.BigDecimal;
import java.util.Scanner;

public class Math {


	
	static Scanner clavier = new Scanner(System.in);
	
	final static BigDecimal TAUX_EURO_DOLLAR = new BigDecimal ("1.0012");
	final static BigDecimal TAUX_DOLLAR_EURO = new BigDecimal ("0.99736");
	
///////////////////// factorielFor /////////////////////////
	
	public static long factorielFor(long nbr) {
		long f = 1;
		
		if (nbr < 0) {
			return -1;
		}
		
		else if (nbr > 20 ) {
			return -2;
		
		}
		
		for (int i = 1; i <= nbr; i++) {
			f = f * i;
		}
		return f;

	}
///////////////////// fin factorielFor /////////////////////////

	
	
	
	/////////////////// factoriel ///////////////////////
	
	public static long factoriel(long n) { // recursive
		
		if (n < 0) {
			return -1;
		}
		
		else if (n > 20 ) {
			return -2;	
		}
		
		else if (n == 0)
			return 1;
		else
			return (n * factoriel(n - 1));
	}
	/////////////////// fin factoriel ///////////////////////
	
	
	
	/////////////////// euroToDollar ///////////////////////
	
	public static BigDecimal euroToDollar (BigDecimal euro) { 
				
		return euro.multiply(TAUX_EURO_DOLLAR);
		
	}
/////////////////// fin euroToDollar ///////////////////////
	
	
	
	/////////////////// DollartoEuro ///////////////////////
	
	public static BigDecimal dollarToEuro (BigDecimal dollar) { 
				
		return dollar.multiply(TAUX_DOLLAR_EURO);
		
	}
/////////////////// fin euroToDollar ///////////////////////
	
		
		
	/////////////////// main //////////////////////

	public static void main(String args[]) {

	}
/////////////////// fin main //////////////////////
	
	
	



}
