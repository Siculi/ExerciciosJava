package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		 float numero_real;
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.print("Digite um numero Real: ");
		 numero_real = teclado.nextFloat();
		 
		 System.out.println("O número digitado foi: " + numero_real);
		 
		 teclado.close();
	}
}
