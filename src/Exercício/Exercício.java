package Exerc�cio;
import java.util.Scanner;

public class Exerc�cio {
	public static void main(String[] agrs) {
		
		int x, y, soma;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um N�mero: ");
		x = leitor.nextInt();
		
		System.out.println("Digite um Segundo N�mero: ");
		y = leitor.nextInt();
		
		soma = x + y;
		
		if (soma>10)
		{
			System.out.println(soma);
		}
		
	}
	
}
