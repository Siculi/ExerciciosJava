package Testes;

public class teste03 {

	public static void main(String[] args) {
						
		//Declarar uma matriz informando somente as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5]; // Colocou um array de 5 elemento na linha 0
		matriz[1] = new int[3]; // Colocou um array de 3 elemento na linha 1 
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[i].length;j++)
			{
				System.out.print(matriz[i][j]+" ");
				//System.out.println("Numeros ["+i+"]["+j+"] = "+numeros[i][j]);
			}System.out.println();
		}
		
	}

}
