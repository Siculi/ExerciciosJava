//"While" 
package geek;

import java.util.Scanner;

public class Programa07 {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		Scanner teclado = new Scanner(System.in); //Para receber dados via teclado
		
		// No "WHILE" o valor sempre é checado antes de entrar no bloco
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.");
		}
			
		teclado.close();
	}
}
