package Testes;

import java.util.Scanner;

public class Teste001 {

	public static void main(String[] args) {

		int idade = 1;
		String nome;
		
		Scanner teclado = new Scanner(System.in); //Para receber dados via teclado
		
		// No "WHILE" o valor sempre é checado antes de entrar no bloco
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
						
			System.out.println("O nome é: " + nome + ".\n");
		}
			
		teclado.close();

	}

}
