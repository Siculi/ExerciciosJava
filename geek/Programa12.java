package geek;

public class Programa12 {

	public static void main(String[] args) {
		//Tipos Primários/Primitivo
		float preco1 = 23.4f; //Por padrão, os números reais em Java são considerados double 
		double preco2 = 23.4;
		
		//Tipos Não Primários/Primitivo
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preco1 = " + preco1);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);
		
		System.out.println("\nESPAÇO EM MEMÓRIA\n");
			System.out.println("	float/Float -> " + Float.SIZE + " bits.");
			System.out.println("	double/Double -> " + Double.SIZE + " bits.");
			
		System.out.println("\nVALORES DE MÁXIMO E DE MÍNIMO.\n");
			System.out.println("	Valor Min float/Float -> " + Float.MIN_VALUE);
			System.out.println("	Valor Max float/Float -> " + Float.MAX_VALUE);
			System.out.print("\n");
			System.out.println("	Valor Min double/Double -> " + Double.MIN_VALUE);
			System.out.println("	Valor Max double/Double -> " + Double.MAX_VALUE);
	}

}
