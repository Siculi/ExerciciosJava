//Tipos Booleanos
package geek;  

public class Programa14 {
	public static void main(String[] args) {
		
		//Tipos Primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos Não-Primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("verdadeiro -> " +verdadeiro);
		System.out.println("falso -> " + falso);
		System.out.println("v -> " + v);
		System.out.println("f -> " + f);
		
		if(verdadeiro) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
				
		if(1 == 1) {System.out.println("1 == 1 é Verdadeiro.");}
		
		boolean teste;
		 
		teste = (1 == 1);
		System.out.println("Teste -> " + teste);
		
	}
}
