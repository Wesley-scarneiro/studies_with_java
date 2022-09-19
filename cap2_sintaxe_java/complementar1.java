/*
 * Popule uma matriz 3x3 com números reais aleatórios, gerados por random.nextDouble(MAX) e também random.nextInt(MAX).
 * O argumento MAX (inteiro) também deve ser gerado aleatoriamente, com valor máximo em 100.
. */
package studies_with_java.capitulo2_exercicios;

import java.util.Random;

public class complementar1 {
	
	/*
	 * Gera números do tipo double e int aleatórios para popular uma matriz quadrada de ordem N.
	 * Se tipo = true, então é guardado um valor tipo double. Caso ao contrário, é guardado um tipo int.
	 */
	public static void popularMatriz(double [][] matriz) {
		
		Random random = new Random();
		boolean tipo;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				tipo = random.nextBoolean();
				int max = random.nextInt(100);
				if (tipo == true) matriz[i][j] = random.nextDouble(max);
				else matriz[i][j] = random.nextInt(max);
			}
		}
	}
	
	/*
	 * Imprime uma matriz quadrada.
	 */
	public static void imprimir(double[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.printf("%.2f\t", matriz[i][j]);
			}
			
			System.out.println();
		}
	}
	

	public static void main(String[] args) {

		double [][] matriz = new double[3][3];
		popularMatriz(matriz);
		imprimir(matriz);
	}

}
