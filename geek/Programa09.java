//FOR
package geek;

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		// FOR(Variável de Controle; Condição de Parada; Forma de Incremento)
		for(int i=0;i<5;i++)
		{
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.\n\n");
		}
			
		teclado.close();
	}
}
