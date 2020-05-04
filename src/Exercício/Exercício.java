package Exercício;
import java.util.Scanner;

public class Exercício 
{
	
	public static void main(String[] agrs) 
	{
		Scanner leitor = new Scanner (System.in);
		String x; 
		
		System.out.println("Digite A Senha: ");
		x = leitor.next();
		
		if(x.compareTo("AEDB") == 0) {
			System.out.println("Acesso Permitido");
		}
		else {
			System.out.println("Você não tem acesso ao sistema");
		}
	}
	
}
