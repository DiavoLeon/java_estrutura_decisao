package Exercício;
import java.util.Scanner;

public class Exercício {
	public static void main(String[] agrs) {
		
		int x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();

		if (x > 20)
		{
			System.out.println(x);
		}

		
	}
	
}
