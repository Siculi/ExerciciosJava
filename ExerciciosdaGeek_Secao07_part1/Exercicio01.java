package ExerciciosdaGeek_Secao07_part1;

public class Exercicio01 {
	public static void main(String[] args) {
		int soma, vetor[] = {1, 0, 5, -2, -5, 7};
		
		soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.printf("%d + %d + %d = %d\n\n", vetor[0], vetor[1], vetor[5], soma);
		
		vetor[4] = 100;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
		}
	}
}
