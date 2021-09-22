package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		float numero, quinto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número para obter seu quinto: ");
		numero = teclado.nextFloat();
		
		quinto = numero/5;
		
		System.out.print("\n" + numero+"/5 = " + quinto);
		
		teclado.close();		
	}

}
