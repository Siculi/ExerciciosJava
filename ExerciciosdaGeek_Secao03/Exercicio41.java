package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		double Valor_hora, Hora_Trab, Salario;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Valor da Hora: ");
		Valor_hora = teclado.nextDouble();
		
		System.out.print("Horas no mês: ");
		Hora_Trab = teclado.nextDouble();
		
		Salario = Valor_hora * Hora_Trab * 1.1;
		
		System.out.print("Salario: R$ " + Salario);
		
		teclado.close();		
	}

}
