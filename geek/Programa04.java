//If, else, else if
package geek;

public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inicializando a variável 
		int numero = 23;
		
		/*
		 	Se (Isso_1 for verdadeiro) Então {faça Aquilo_1}; 
		 		Senão Se (Isso_2 for verdadeiro) {faça Aquilo_2};
		 			Senão Se (Isso_3 for verdadeiro) {faça Aquilo_3};
		 				.........
		 				Senão Se (Isso_(n-1) for verdadeiro) {faça Aquilo_(n-1};
		 					Senão {faça Aquilo_(n)};		
		*/
		if(numero > 5){
			System.out.println("Sim, o número " + numero + " é maior que 5.");
		}else if (numero == 5)
		{
			System.out.println("O número " + numero + " é igual a 5.");
		}else
			{
				System.out.println("Não, o número " + numero + " não é maior que 5");
			}

	}

}
