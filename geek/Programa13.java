//Tipos de Dados Alfanúmericos
//Caracteres e strings
package geek;

public class Programa13 {

	public static void main(String[] args) {
		//Tipos Primitivos
		char letra_1 = 'a';
		char letra_2 = 97; // 97 equivale a letra 'a' na tabela ASCII 
		//string nome = "Jose"; NÃO existe o tipo primitivo "string" em Java 
		
		System.out.println("Letra_1 -> " + letra_1);
		System.out.println("Letra_2 -> " + letra_2);
			letra_2 = (char) (letra_2 + 1);
	  //variavel = (cast) (variavel + 1); o "cast" devolve para o formato pedido
		System.out.println("Letra_2 -> " + letra_2);
		
		//Tipos Não-Primitivos
		Character letra_3 = 'W'; System.out.println("letra_3 -> " + letra_3);
		String nome = "Geek University";
		
		System.out.println("nome = " + nome);
				
		System.out.println("\nEspaço em memória: char/Character -> " + Character.SIZE + " bits.");
		System.out.println("\nTamanho da String: " + nome.length());
		System.out.println("Espaço em memória: String -> " + Character.SIZE*nome.length() + " bits.");
	}

}
