package Exercício;

import java.util.Scanner;

public class Exercício {
	public static void main(String[] agrs) {
		int x, y;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();
		
		System.out.println("Digite um Segundo Número: ");
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
