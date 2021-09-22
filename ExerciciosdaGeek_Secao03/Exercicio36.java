package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		float r, h, volume;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Volume do Cilindro\n");
		
		System.out.print("Digite o raio: ");
		r = teclado.nextFloat();
		
		System.out.print("Digite a altura: ");
		h = teclado.nextFloat();
		
		volume = h * r * r * (float)3.141592; 
		
		System.out.print("\n\nO volume é: " + volume);
		
		teclado.close();
	}
}
