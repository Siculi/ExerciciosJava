package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = teclado.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numero);		
		
		teclado.close();
	}
}
