package ExerciciosdaGeek_Secao03;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		double preco, preco_vista, parcela, comis_vista, comis_prazo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Preço do Produto: R$ ");
		preco = teclado.nextDouble();
		
		preco_vista = preco*0.9;
		parcela = preco/3;
		comis_vista = preco_vista * 0.05;
		comis_prazo	= preco * 0.05;	
		
		System.out.printf("\nValor a vista com 10%% desc.:   R$ %.2f", preco_vista);
		System.out.printf("\nValor parcela em 3X sem juros: R$ %.2f", parcela);
		System.out.printf("\nComissão da venda a vista:     R$ %.2f", comis_vista);
		System.out.printf("\nComissão da venda a prazo:     R$ %.2f", comis_prazo );
		
		teclado.close();
	}

}
