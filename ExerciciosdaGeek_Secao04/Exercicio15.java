package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int dia;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero de 1 a 7: ");
		dia = teclado.nextInt();
		
		switch (dia)
		{
		case 1:
			System.out.printf("Domingo");
			break;
		
		case 2:
			System.out.printf("Segunda-feira");
			break;
			
		case 3:
			System.out.printf("Ter�a-feira");
			break;
			
		case 4:
			System.out.printf("Quarta-feira");
			break;
	
		case 5:
			System.out.printf("Quinta-feira");
			break;
	
		case 6:
			System.out.printf("Sexta-feira");
			break;
			
		case 7:
			System.out.printf("S�bado");
			break;
		
		default:
			System.out.printf("\"%d\" n�o � um n�mero entre 1 e 7.", dia);
			break;
		}
		
		teclado.close();		
	}

}
