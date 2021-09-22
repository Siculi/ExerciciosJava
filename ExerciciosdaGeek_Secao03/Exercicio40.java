package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		//float Sal, dias_t, desc = (float)0.98, preco_d = (float)30.0;
		double Sal, dias_t, desc = 0.92, preco_d = 30.0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quantidade de dias trabalhados: ");
		dias_t = teclado.nextFloat();
		
		Sal = dias_t * preco_d * desc;
		
		System.out.println("R$ " + (dias_t * preco_d) + " + 8% desc.: R$ " + Sal);		
		
		teclado.close();
	}

}
		