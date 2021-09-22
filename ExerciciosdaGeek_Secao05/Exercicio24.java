package ExerciciosdaGeek_Secao05;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		int i, num, soma;
		
		soma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		num = teclado.nextInt();
		
		for(i=1;i<num;i++) {
			if(num % i == 0) {
				//System.out.printf("%d\n", i);
				soma = soma + i;
			}
		}
		
		System.out.printf("\nA soma de todos os divisores de %d exceto ele mesmo é: %d", num, soma);
		
		teclado.close();
	}

}
