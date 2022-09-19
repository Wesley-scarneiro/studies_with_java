/*
 * Popule uma matriz 3x3 com n�meros reais aleat�rios, gerados por random.nextDouble(MAX) e tamb�m random.nextInt(MAX).
 * O argumento MAX (inteiro) tamb�m deve ser gerado aleatoriamente, com valor m�ximo em 100.
. */
package studies_with_java.capitulo2_exercicios;

import java.util.Random;

public class complementar1 {
	
	/*
	 * Gera n�meros do tipo double e int aleat�rios para popular uma matriz quadrada de ordem N.
	 * Se tipo = true, ent�o � guardado um valor tipo double. Caso ao contr�rio, � guardado um tipo int.
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
