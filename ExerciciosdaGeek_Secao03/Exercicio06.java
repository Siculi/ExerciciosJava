package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		float celsius, fahrenheit;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Temperatura em Celsius: ");
		celsius = teclado.nextFloat();
		
		fahrenheit = celsius*((float)9/5) + (float)32; // Por algum motivo ele faz uma aproximação esdrúxula
		
		System.out.println(celsius + "º Celsius = " + fahrenheit + " fahrenheit.");
		
		teclado.close();
	}

}
