package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		float premio = 780000, g_1, g_2, g_3, verif;
		
		Scanner teclado = new Scanner (System.in);
		
		g_1 = premio * (float)0.46;
		g_2 = premio * (float)0.32;
		g_3 = premio * (float)0.22;
		
		System.out.println("Primeiro ganhador: R$ " + g_1);
		System.out.println("Segundo ganhador:  R$ " + g_2);
		System.out.println("Terceiro ganhador: R$ " + g_3);
		
		verif = g_1 + g_2 + g_3;
		
		System.out.print("\nR$ " + g_1 + " + R$ " + g_2 + " + R$ " + g_3 + "= R$ " + verif);
		
		teclado.close();		
	}

}
