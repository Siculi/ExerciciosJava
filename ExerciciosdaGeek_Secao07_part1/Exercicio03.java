package ExerciciosdaGeek_Secao07_part1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int vetor_1[] = new int[10], vetor_2[] = new int[10];
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<vetor_1.length;i++) {
			System.out.printf("%dº Valor: ", i+1);
			vetor_1[i] = teclado.nextInt();
		}
			
		for(int i=0;i<vetor_1.length;i++) {
			vetor_2[i] = vetor_1[i] * vetor_1[i];
		}
		
		System.out.printf("\n");
		
		for(int i=0;i<vetor_1.length;i++) {
			System.out.printf("%d² = %d\n", vetor_1[i], vetor_2[i]);			
		}
		
		teclado.close();
	}

}
