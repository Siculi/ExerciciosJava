package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
		float S_i, S_f;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Salário Inicial: R$ ");
		S_i = teclado.nextFloat();
		
		S_f = S_i * (float)1.25;
		
		System.out.println("Salário com 25% de adicional: R$ " + S_f);
				
		teclado.close();
	}
}
