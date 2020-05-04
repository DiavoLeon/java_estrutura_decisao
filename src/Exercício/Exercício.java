package Exercício;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercício 
{
	
	public static void main(String[] agrs) 
	{
		DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        
		Scanner leitor = new Scanner (System.in);
		
		double preco;
		
		System.out.println("Digite o Preço: ");
		preco = leitor.nextDouble();
		
		if(preco >= 20) {
			preco = preco + ((preco / 100) * 45);
			System.out.println("Preço do produto: "+ df.format(preco));
		}
		else {
			preco = preco + ((preco/100) * 30);
			System.out.println("Preço do produto: "+ df.format(preco)); 
		}
	}
	
}
