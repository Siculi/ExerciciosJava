package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {
		float V_i, V_f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Valor do produto: R$ ");
		V_i = teclado.nextFloat();
		
		//V_f = V_i * (float)0.88;
		V_f = (V_i * 88)/100;
		
		System.out.println("R$ " + V_i + " com 12% de desconto: R$ " + V_f);
		
		teclado.close();
	}
}
