package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		num = teclado.nextDouble();
		
		if(num >= 0)
		{
			System.out.printf("\nRaiz Quadrada de %.4f = %.4f", num, Math.sqrt(num));
			
		}else {
			System.out.printf("\nO n�mero %.4f � INVALIDO.", num);
		}
		
		teclado.close();
	}

}
