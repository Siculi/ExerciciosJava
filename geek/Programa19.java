package geek;

public class Programa19 {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][3];
		
		numeros[0][0] = 1;
		numeros[0][1] = 3; 
		numeros[0][2] = 5;
		numeros[1][0] = 7;
		numeros[1][1] = 9;
		numeros[1][2] = 11;
		numeros[2][0] = 13;
		numeros[2][1] = 15;
		numeros[2][2] = 17;
		
		System.out.println(numeros.length);
		System.out.println(numeros[0].length);
		
		System.out.println();
		  
		for(int i=0;i<numeros.length;i++)
		{
			for(int j=0;j<numeros[i].length;j++)
			{
				System.out.print(i + j*2+" ");
				System.out.print((i + j)*2);
				System.out.println();
				//System.out.print(numeros[i][j]+" ");
				//System.out.println("Numeros ["+i+"]["+j+"] = "+numeros[i][j]);
			}System.out.println();
		}
	}

}
