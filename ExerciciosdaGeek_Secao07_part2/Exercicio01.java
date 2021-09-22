package ExerciciosdaGeek_Secao07_part2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4], cont = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.printf("Matriz[%d][%d] = ", i,j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		System.out.printf("\n");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j] > 10) {
					System.out.printf("Matriz[%d][%d] = %d\n", i,j, matriz[i][j]);
					cont++;
				}
			}
		}		
		
		System.out.printf("\n%d posições possuem valor maior do que 10.", cont);
		
		teclado.close();
	}

}
