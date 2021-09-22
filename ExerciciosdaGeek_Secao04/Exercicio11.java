package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		int i;
		double num, soma, resto;
		
		soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		num = teclado.nextDouble();
		
		while(num > 0) {
			resto = num % 10;
			soma = soma + resto;
			num = (num - resto)/10;
		}
		
		System.out.printf("A soma é: %.0f", soma);
		
		teclado.close();
	}
}
