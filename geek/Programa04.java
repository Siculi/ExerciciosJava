//If, else, else if
package geek;

public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inicializando a vari�vel 
		int numero = 23;
		
		/*
		 	Se (Isso_1 for verdadeiro) Ent�o {fa�a Aquilo_1}; 
		 		Sen�o Se (Isso_2 for verdadeiro) {fa�a Aquilo_2};
		 			Sen�o Se (Isso_3 for verdadeiro) {fa�a Aquilo_3};
		 				.........
		 				Sen�o Se (Isso_(n-1) for verdadeiro) {fa�a Aquilo_(n-1};
		 					Sen�o {fa�a Aquilo_(n)};		
		*/
		if(numero > 5){
			System.out.println("Sim, o n�mero " + numero + " � maior que 5.");
		}else if (numero == 5)
		{
			System.out.println("O n�mero " + numero + " � igual a 5.");
		}else
			{
				System.out.println("N�o, o n�mero " + numero + " n�o � maior que 5");
			}

	}

}
