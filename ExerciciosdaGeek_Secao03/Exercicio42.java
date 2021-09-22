package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		double sal_bas, sal_corr, grat = 1.05, imp = 0.07;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Salário-Base:   R$ ");
		sal_bas = teclado.nextDouble();
		
		
		sal_corr = (sal_bas * grat) - (sal_bas * imp);
		
				
		System.out.printf("\nSalario base:   R$ %.2f", sal_bas);
		System.out.printf("\nGratificação: + R$ %.2f", sal_bas * (grat - 1));
		System.out.printf("\nImpostos:     - R$ %.2f",  sal_bas * (imp));
		System.out.printf("\n\nSalário Liq.:   R$ %.2f", sal_corr);
		
		
		teclado.close();
	}

}
