package Exerc�cio;

import java.util.Scanner;

public class Exerc�cio {
	public static void main(String[] agrs) 
	{
		int x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um N�mero: ");
		x = leitor.nextInt();
		
		if(x % 2 == 0 ) 
		{
		System.out.println("Esse N�mero � Par");
		}
		else  
		{
		System.out.println("Esse N�mero � Impar");	
		}
	
	}
	
}
