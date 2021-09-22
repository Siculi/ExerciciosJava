package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		double A,B,C, m_dif, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("1º lado: ");
		A = teclado.nextDouble();
		
		System.out.printf("2º lado: ");
		B = teclado.nextDouble();
		
		System.out.printf("3º lado: ");
		C = teclado.nextDouble();
		
		// Não é preciso comparar 3 a 3 os lados, basta garantir que "|b-c| < a < b+c"
		
		m_dif = B - C;
		soma = B + C;
		if(m_dif < 0) {m_dif = m_dif * (-1);}  
		
		if((m_dif < A) && (A < soma))
		{
			System.out.printf("\nCondição de Existência satisfeita.");
			
			if((A == B) || (B == C) || (A == C)) {
				if((A == B) && (B == C) && (A == C)) {
					System.out.printf(" O triângulo é equilátero.");
				}else {
					System.out.printf(" O triângulo é isósceles.");
				}
					
			}else {
				System.out.printf(" O triângulo é escaleno.");
			}
			
		}else {
			System.out.printf("\nCondição de Existência NÃO satisfeita.");
		}
		
		teclado.close();
	}

}
