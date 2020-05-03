package Exercício;

import java.util.Scanner;

public class Exercício {
	public static void main(String[] agrs) {
		
		Scanner leitor = new Scanner (System.in);
		int x;
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();
		
		if (x > 0) {
			System.out.println("Positivo");
		}
		else if (x < 0) {
			System.out.println("Negativo");
		}
			
		
	}
	
}
