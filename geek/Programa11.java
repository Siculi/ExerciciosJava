//Tipos de Dados
//Númerico (Inteiros e Reais)
package geek;

public class Programa11 {
	public static void main(String[] args) {
		//Tipos Primários/Primitivo
			long num0 = 13;
			int num1 = 10; 
			short num2 = 11; 
			byte num5 = 12;		
			char num8 = 36; // Retorna caracter da tabela ASCII
		
		//Tipos não Primários/Primitivo
			Long num7 = (long)14;
			Integer num3 = 15;
			Short num4 = 16;
			Byte num6 = 17;
			Character num9 = 35; // Retorna caracter da tabela ASCII
		
		System.out.println("PRIMÁRIOS\n");
			System.out.println("	long -> num0 = " + num0);
			System.out.println("	int -> num1 = " + num1);
			System.out.println("	short -> num2 = " + num2);
			System.out.println("	byte -> num5 = " + num5);
			System.out.println("	char -> num8 = " + num8);
				
		System.out.println("\nNÃO-PRIMÁRIOS\n");
			System.out.println("	Long -> num7 = " + num7);
			System.out.println("	Integer -> num3 = " + num3);
			System.out.println("	Short -> num4 = " + num4);
			System.out.println("	Byte -> num6 = " + num6);
			System.out.println("	Character -> num9 = " + num9);
		
		System.out.println("\nESPAÇO EM MEMÓRIA\n");
			System.out.println("	long/Long -> " + Long.SIZE + " bits.");
			System.out.println("	int/Integer -> " + Integer.SIZE + " bits.");
			System.out.println("	short/Short -> " + Short.SIZE + " bits.");
			System.out.println("	byte/Byte -> " + Byte.SIZE + " bits.");
			System.out.println("	char/Character -> " + Character.SIZE + " bits.");
		
		System.out.println("\nVALORES DE MÁXIMO E DE MÍNIMO.\n");
			System.out.println("	Valor Min long/Long -> " + Long.MIN_VALUE);
			System.out.println("	Valor Max long/Long -> " + Long.MAX_VALUE);
			System.out.print("\n");		
			System.out.println("	Valor Min int/Integer -> " + Integer.MIN_VALUE);
			System.out.println("	Valor Max int/Integer -> " + Integer.MAX_VALUE);
			System.out.print("\n");
			System.out.println("	Valor Min short/Short -> " + Short.MIN_VALUE);
			System.out.println("	Valor Max short/Short -> " + Short.MAX_VALUE);
			System.out.print("\n");
			System.out.println("	Valor Min byte/Byte -> " + Byte.MIN_VALUE);
			System.out.println("	Valor Max byte/Byte -> " + Byte.MAX_VALUE);
			System.out.print("\n");
			System.out.println("	Valor Min char/Character -> " + Character.MIN_VALUE); //0
			System.out.println("	Valor Max char/Character -> " + Character.MAX_VALUE); //65535
		
	}
}
