package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		double num_1, num_2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Primeiro número: ");
		num_1 = teclado.nextDouble();
		
		System.out.printf("Segundo número: ");
		num_2 = teclado.nextDouble();
		
		if(num_1 > num_2) {
			System.out.printf("Maior: %.2f", num_1);
		}else if(num_2 > num_1) {
			System.out.printf("Maior: %.2f", num_2);
		}else {
			System.out.printf("Os números são iguais.");
		}
		
		teclado.close();
	}

}
