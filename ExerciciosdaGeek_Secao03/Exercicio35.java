package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		float a,b,hip;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o cateto 'a': ");
		a = teclado.nextFloat();
		
		System.out.print("Digite o cateto 'b': ");
		b = teclado.nextFloat();
		
		hip  = a*a + b*b;
		
		hip = (float)Math.sqrt(hip);
		
		System.out.print("\nA hipotenusa é: " + hip);
		
		teclado.close();
	}

}
