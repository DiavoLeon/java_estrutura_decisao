package Exercício;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercício 
{
	
	public static void main(String[] agrs) 
	{
		Scanner leitor = new Scanner (System.in);
		int x; 
		double y, z;
		
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("KG #,##0.00");
        
		
		System.out.println("Digite 1 para Masculino, 2 para Feminino");
		
		x = leitor.nextInt();
		
		System.out.println("Digite sua Altura");
		y = leitor.nextDouble();
		
		if(x == 1) {
			z = (72.7 * y - 58);
			System.out.println("Seu Peso Ideal é: " + df.format(z));
		}
		else {
			z = (62.1 * y - 44.7);
			System.out.println("Seu Peso Ideal é: " + df.format(z));
		}
	}
	
}
