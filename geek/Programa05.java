//Operador tern�rio
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
			
		// Variavel = (Isso Verdadeiro) ? Ent�o Aquilo : Sen�o Aquilo_outro
		numero = (valor > 0) ? valor : 7; // Operador Tern�rio 
		
		System.out.println(numero);
	}
}
