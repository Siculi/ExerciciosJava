package geek;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		
		int idade = -1;
		String nome;
		
		Scanner teclado = new Scanner(System.in);		
		
		// Primeiro faz a checagem e s� depois executa. 
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.");
		} while(idade > 0);
			
		teclado.close();

	}

}
