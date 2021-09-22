package geek;

public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, resultado;
		float resultado_2, resultado_3;
		
		//Soma
		resultado = num1 + num2;
		System.out.println("A soma de '" + num1 + " + " + num2 + "' é " + resultado);
		
		//SUbtração
		resultado = num2 - num1;
		System.out.println("A subtração de '" + num2 + " - " + num1 + "' é " + resultado);
		
		//Multiplicação
		resultado = num1 * num2;
		System.out.println("A multiplicação de '" + num2 + " x " + num1 + "' é " + resultado);
		
		//Divisão
		resultado = num2 / num1;
		System.out.println("A divisão de '" + num2 + " / " + num1 + "' é " + resultado);
		
		resultado_2 = num2 / num1;
		System.out.println("A divisão de '" + num2 + " / " + num1 + "' é " + resultado_2);
		
		resultado_3 = (float) num2 / (float) num1;
		System.out.println("A divisão de '" + num2 + " / " + num1 + "' é " + resultado_3);
		
		//Módulo (Resto da divisão)
		int num3 = 17, num4 = 6;  
		resultado = num3 % num4;
		System.out.println("O resto da divisão de '" + num3 + " por " + num4 + "' é " + resultado);
	}

}
