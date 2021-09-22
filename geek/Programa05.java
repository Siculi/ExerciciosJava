//Operador ternário
package geek;

public class Programa05 {
		public static void main(String[] args) {
			int  valor = -3, numero;
		
		/*
		if(valor > 0) {
				numero = valor;
		}else {
			numero = 7;
		}			
		*/
			
		// Variavel = (Isso Verdadeiro) ? Então Aquilo : Senão Aquilo_outro
		numero = (valor > 0) ? valor : 7; // Operador Ternário 
		
		System.out.println(numero);
	}
}
