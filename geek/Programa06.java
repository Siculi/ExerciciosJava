 //Intru��o Switch
package geek;

public class Programa06 {
	public static void main(String[] args) {
		int numero = 1;
		
		switch (numero) 
		{
			case 1:
				System.out.println("O n�mero � 1.");
				break;
			case 3:
				System.out.println("O n�mero � 3");
				break;
			case 5:
				System.out.println("O n�mero � 5");
				break;				
			default:
				System.out.println("[Default] O n�mero � " + numero );
				break;
		}
	}
}
