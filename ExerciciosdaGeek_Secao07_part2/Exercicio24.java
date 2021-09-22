package ExerciciosdaGeek_Secao07_part2;

public class Exercicio24 {

	/*
	 * Em uma matriz 20x20, 
	 * qual é o maior produto de quatro números adjacentes em qualquer direção(cima, baixo,esquerda,direita, ou na diogonal) 
	 */
	
	public static void main(String[] args) {
		int matriz[][] = new int[20][20], produto = 1, max_produto, cont = 0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.printf("|%3d ",matriz[i][j]);
			}System.out.printf("|\n");
		}
		
		max_produto = matriz[0][0] * matriz[0][1] * matriz[0][2] * matriz[0][3];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {

				if(i <= (matriz[i].length-4)) // para uma matriz de tamanho menor que 4 não dar problema é preciso limitar "j" 
				{
					produto = matriz[i][j] * matriz[i+1][j] * matriz[i+2][j] * matriz[i+3][j]; 
					cont++;
				} // horizontal
					if(produto > max_produto) {	max_produto = produto;}
				
				//---------------------------------------------------------------------------------------------------------
				
				if(j <= (matriz[j].length-4)) // para uma matriz de tamanho menor que 4 não dar problema é preciso limitar "i"
				{
					produto = matriz[i][j] * matriz[i][j+1] * matriz[i][j+2] * matriz[i][j+3]; 
					cont++;
		 		} // vertical
					if(produto > max_produto) {	max_produto = produto;}
				
				//---------------------------------------------------------------------------------------------------------
				
				if((i <= (matriz[i].length-4)) && (j <= (matriz[j].length-4))) 
				{
					produto = matriz[i][j] * matriz[i+1][j+1] * matriz[i+2][j+2] * matriz[i+3][j+3]; 
					cont++;
				} // diagonal pra baixo
					if(produto > max_produto) {	max_produto = produto;}
				
				//---------------------------------------------------------------------------------------------------------
				
				if(((i-3) >= 0) && (j <= (matriz[j].length-4))) 
				{
					produto = matriz[i][j] * matriz[i-1][j+1] * matriz[i-2][j+2] * matriz[i-3][j+3]; 
					cont++;
				} // diagonal pra cima
						if(produto > max_produto) {	max_produto = produto;}
			}			
		}
		
		System.out.printf("\nTotal de combinações: %d", cont);
		System.out.printf("\nO maior produto é: %d", max_produto);				
	}

}
