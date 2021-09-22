package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int num_1, num_2, num_3, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		num_1 = teclado.nextInt();
		
		System.out.print("Segundo número: ");
		num_2 = teclado.nextInt();
		
		System.out.print("Terceiro número: ");
		num_3 = teclado.nextInt();
		
		soma = num_1 + num_2 + num_3;
		
		System.out.print("\nA soma de " + num_1 + " + " + num_2 + " + "  + num_3 + " é: " + soma);
		
		teclado.close();		
	}

}
