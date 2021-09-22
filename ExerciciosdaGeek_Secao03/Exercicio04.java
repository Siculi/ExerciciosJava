package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float numero, quadrado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um real para obter seu quadrado: ");
		numero = teclado.nextFloat();
		
		quadrado = numero * numero;
		
		System.out.print(numero + " ao quadrado é: " + quadrado);
		
		teclado.close();
	}

}
