package Exercício;
import java.util.Scanner;

public class Exercício 
{
	
	public static void main(String[] agrs) 
	{
		Scanner leitor = new Scanner (System.in);
		float x, y, z, total, soma;
		x = 2;
		y = 3;
		z = 5;
		soma = x + y + z;
		
		System.out.println("Digite a primeira nota: ");
		x = leitor.nextFloat() * x;
		
		System.out.println("Digite a segunda nota: ");
		y = leitor.nextFloat() * y;
		
		System.out.println("Digite a terceira nota: ");
		z = leitor.nextFloat() * z;
		
		total = x + y + z;
		
		if(total / soma >= 7) {
			System.out.println("APROVADO");
		}
		
		else {
			System.out.println("REPROVADO");
		}
	}
	
}
