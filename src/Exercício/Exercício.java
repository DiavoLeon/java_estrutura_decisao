package Exerc�cio;

import java.util.Scanner;

public class Exerc�cio {
	public static void main(String[] agrs) {
		
		Scanner leitor = new Scanner (System.in);
		int x;
		
		System.out.println("Digite um N�mero: ");
		x = leitor.nextInt();
		
		if (x > 0) {
			System.out.println("Positivo");
		}
		else if (x < 0) {
			System.out.println("Negativo");
		}
			
		
	}
	
}
