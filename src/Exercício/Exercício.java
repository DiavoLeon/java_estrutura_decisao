package Exercício;

import java.util.Scanner;

public class Exercício {
	public static void main(String[] agrs) 
	{
		int x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();
		
		if(x % 2 == 0 ) 
		{
		System.out.println("Esse Número é Par");
		}
		else  
		{
		System.out.println("Esse Número é Impar");	
		}
	
	}
	
}
