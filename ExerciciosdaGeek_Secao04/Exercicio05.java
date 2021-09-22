package ExerciciosdaGeek_Secao04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		num = teclado.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.printf("O número %d é par", num);
		}else{
			System.out.printf("O número %d é impar", num);
		}
		
		teclado.close();		
	}

}
