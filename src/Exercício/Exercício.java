package Exercício;
import java.util.Scanner;

public class Exercício {
	public static void main(String[] agrs) {
		
		int x, y, soma;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();
		
		System.out.println("Digite um Segundo Número: ");
		y = leitor.nextInt();
		
		soma = x + y;
		
		if (soma>10)
		{
			System.out.println(soma);
		}
		
	}
	
}
