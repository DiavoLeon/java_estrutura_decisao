package Exercício;

import java.util.Scanner;

public class Exercício 
{
	
	public static void main(String[] agrs) 
	{
		int x, y;
		String a, b;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Bem Vindo Pessoa (A). Por favor digite seu nome: ");
		a = leitor.next();
		
		System.out.println("Digite sua Idade: ");
		x = leitor.nextInt();
		
		System.out.println("Bem Vindo Pessoa (B). Por favor digite seu nome: ");
		b = leitor.next();
		
		System.out.println("Digite sua Idade: ");
		y = leitor.nextInt();
		
		if(x>y) {
			System.out.println("Nome : "+ a + " \nIdade: " + x);
			
		}
		else {
			System.out.println("Nome : "+ b + " \nIdade: " + y);
		}
	}
	
}
