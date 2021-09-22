package geek;

public class Programa17 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i] = i + 3;
		}
		
		System.out.println("Primeiro elemento: " + numeros[0]); //primeiro elemento
		System.out.println("�ltimo elemento: " + numeros[9]); //�ltimo elemento
		System.out.println();
		
		System.out.println(Math.random() + "\n"); //Math.random() -> gera um n�mero aleat�rio entre zero e um.
		
		for(int i=0;i<numeros.length;i++)
		{
			numeros[i] = (int)Math.round(Math.random()*10);
			System.out.println(numeros[i]);
		}
		System.out.println();
		for(int i : numeros)
		{
			System.out.println(i);
		}
	}
}
