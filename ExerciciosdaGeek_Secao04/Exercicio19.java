package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		double A,B,C, m_dif, soma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("1� lado: ");
		A = teclado.nextDouble();
		
		System.out.printf("2� lado: ");
		B = teclado.nextDouble();
		
		System.out.printf("3� lado: ");
		C = teclado.nextDouble();
		
		// N�o � preciso comparar 3 a 3 os lados, basta garantir que "|b-c| < a < b+c"
		
		m_dif = B - C;
		soma = B + C;
		if(m_dif < 0) {m_dif = m_dif * (-1);}  
		
		if((m_dif < A) && (A < soma))
		{
			System.out.printf("\nCondi��o de Exist�ncia satisfeita.");
			
			if((A == B) || (B == C) || (A == C)) {
				if((A == B) && (B == C) && (A == C)) {
					System.out.printf(" O tri�ngulo � equil�tero.");
				}else {
					System.out.printf(" O tri�ngulo � is�sceles.");
				}
					
			}else {
				System.out.printf(" O tri�ngulo � escaleno.");
			}
			
		}else {
			System.out.printf("\nCondi��o de Exist�ncia N�O satisfeita.");
		}
		
		teclado.close();
	}

}
