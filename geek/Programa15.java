package geek;

public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, resultado;
		float resultado_2, resultado_3;
		
		//Soma
		resultado = num1 + num2;
		System.out.println("A soma de '" + num1 + " + " + num2 + "' � " + resultado);
		
		//SUbtra��o
		resultado = num2 - num1;
		System.out.println("A subtra��o de '" + num2 + " - " + num1 + "' � " + resultado);
		
		//Multiplica��o
		resultado = num1 * num2;
		System.out.println("A multiplica��o de '" + num2 + " x " + num1 + "' � " + resultado);
		
		//Divis�o
		resultado = num2 / num1;
		System.out.println("A divis�o de '" + num2 + " / " + num1 + "' � " + resultado);
		
		resultado_2 = num2 / num1;
		System.out.println("A divis�o de '" + num2 + " / " + num1 + "' � " + resultado_2);
		
		resultado_3 = (float) num2 / (float) num1;
		System.out.println("A divis�o de '" + num2 + " / " + num1 + "' � " + resultado_3);
		
		//M�dulo (Resto da divis�o)
		int num3 = 17, num4 = 6;  
		resultado = num3 % num4;
		System.out.println("O resto da divis�o de '" + num3 + " por " + num4 + "' � " + resultado);
	}

}
