package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		double nota_1, nota_2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("1ª Nota: ");
		nota_1 = teclado.nextFloat();
		
		System.out.print("2ª Nota: ");
		nota_2 = teclado.nextFloat();
		
		//if(nota_1 >= 0.0){if(nota_1 <= 10.0){if(nota_2 >= 0.0){if(nota_2 <= 10.0){System.out.printf("Média: %.2f", (nota_1 + nota_2)/2);}}}}
		
		if((nota_1 >= 0.0 && nota_2 >= 0.0) && (nota_1 <= 10.0 && nota_2 <= 10.0))
		{
			System.out.printf("Média: %.2f", (nota_1 + nota_2)/2);
		}else {
			System.out.print("Erro. Valor Inválido");
		}
		
		teclado.close();
	}

}
