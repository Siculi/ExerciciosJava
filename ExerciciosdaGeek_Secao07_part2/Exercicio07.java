package ExerciciosdaGeek_Secao07_part2;

public class Exercicio07 {

	public static void main(String[] args) {
		int matriz[][] = new int[10][10];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i<j) {
					matriz[i][j] = 2*i + 7*j -2;
				}else if(i == j){
					matriz[i][j] = 3*i*i -1;					
				}else {
					matriz[i][j] = 4*i*i*i - 5*j*j +1;
				}
			}
		}
		
		System.out.printf("\n");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.printf("|%5d ", matriz[i][j] );
			}System.out.printf("|\n");
		}
		
	}

}
