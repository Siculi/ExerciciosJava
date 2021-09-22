package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double num_1, num_2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Primeiro número: ");
		num_1 = teclado.nextDouble();
		
		System.out.printf("Segundo número: ");
		num_2 = teclado.nextDouble();
		
		if(num_1 > num_2) {
			System.out.printf("O maior número é: %.2f", num_1);
		}else {
			System.out.printf("O maior número é: %.2f", num_2);
		}
		
		teclado.close();
	}

}
