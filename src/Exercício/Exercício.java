package Exerc�cio;

import java.util.Scanner;

public class Exerc�cio {
	public static void main(String[] agrs) {
		int x, y;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um N�mero: ");
		x = leitor.nextInt();
		
		System.out.println("Digite um Segundo N�mero: ");
		y = leitor.nextInt();
		
		if (x>y) {
			System.out.println(x);
			System.out.println(y);
		}
		else {
			System.out.println(y);
			System.out.println(x);
		}
			
	}
	
}
