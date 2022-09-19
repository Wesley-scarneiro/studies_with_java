/*
 * Construa um programa que seja capaz de efetuar a leitura de uma matriz de valores reais de tamanho 1x1, 2x2 e 3x3, sendo capaz
 * também de calcular o determinante da matriz.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Random;

public class Exercicio12 {
	
	/*
	 * Função para gerar uma matriz quadrada de no máximo ordem 3.
	 * Recebe o tamanho "n" da matriz e retorna a referência (ponteiro) da matriz criada.
	 * Popula a matriz com números reais aleatórios, com valor máximo em 100.
	 * Representa a leitura das entradas de uma matriz.
	 */
	public static double [][] gerarMatriz(int n) {
		
		if (n > 0 && n <= 3) {
			
			System.out.println("Matriz de ordem " + n + "x" + n + ":");
			double [][] matriz = new double[n][n];
			Random random = new Random();
			
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j < n; j++) {
					
					matriz[i][j] = random.nextDouble(100);
					System.out.printf("%.2f\t", matriz[i][j]);
				}
				
				System.out.println();
			}
			
			return matriz;

		}
		else {
			
			System.out.println("Tamanho da matriz fora do permitido.");
			return null;
		}
	}
	
	/*
	 * Função para calcular o determinante de uma matriz de no máximo ordem 3.
	 */
	public static void calcularDeterminante(double [][] matriz) {
		
		if (matriz != null) {
			
			if (matriz.length == 1) {
				
				// Determinante de ordem 1.
				System.out.printf("Determinante de matriz de ordem 1x1 = %.2f\n\n", matriz[0][0]);
			}
			else if (matriz.length == 2) {
				
				// Determinante de ordem 2.
				double diagonal1, diagonal2, determinante;
				
				diagonal1 = matriz[0][0] * matriz[1][1];
				diagonal2 = matriz[0][1] * matriz[1][0];
				determinante = diagonal1 - diagonal2;
				System.out.printf("Determinante de matriz de ordem 2x2 = %.2f\n\n", determinante);
	
			}
			else {
				
				// Determinante de ordem 3, utilizando regra de Sarrus.
				double diagonalp1, diagonalp2, diagonalp3, diagonalt1;
				double diagonals1, diagonals2, diagonals3, diagonalt2;
				double determinante;
	
				diagonalp1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
				diagonalp2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
				diagonalp3 = matriz[0][2] * matriz[1][0] * matriz[2][1];
				diagonalt1 = diagonalp1 + diagonalp2 + diagonalp3;
				
				diagonals1 = matriz[0][2] * matriz[1][1] * matriz[2][0];
				diagonals2 = matriz[0][0] * matriz[1][2] * matriz[2][1];
				diagonals3 = matriz[0][1] * matriz[1][0] * matriz[2][2];
				diagonalt2 = diagonals1 + diagonals2 + diagonals3;
				
				determinante = diagonalt1 - diagonalt2;
				System.out.printf("Determinante de matriz de ordem 3x3 = %.2f\n\n", determinante);
			}
		}
		else {
			
			System.out.println("Referência nula, determinante não calculado.");
		}
	}
	

	public static void main(String[] args) {
		
		double [][] matriz1 = gerarMatriz(1);
		calcularDeterminante(matriz1);

		double [][] matriz2 = gerarMatriz(2);
		calcularDeterminante(matriz2);

		double [][] matriz3 = gerarMatriz(3);
		calcularDeterminante(matriz3);
		
		System.out.println("\nTestes:");
		//determinante = -7
		double [] [] teste1 = {{1, 5}, {2, 3}};
		calcularDeterminante(teste1);
		
		// Determinante = 358
		double [] [] teste2 = {{1, 9, 5}, {3, 7, 8}, {10, 4, 2}};
		calcularDeterminante(teste2);
		
	}

}
/*
Matriz de ordem 1x1:
93,57	
Determinante de matriz de ordem 1x1 = 93,57

Matriz de ordem 2x2:
13,28	60,18	
4,28	37,50	
Determinante de matriz de ordem 2x2 = 240,27

Matriz de ordem 3x3:
83,73	32,56	99,67	
66,92	5,28	45,91	
59,67	73,38	49,12	
Determinante de matriz de ordem 3x3 = 179844,39


Testes:
Determinante de matriz de ordem 2x2 = -7,00

Determinante de matriz de ordem 3x3 = 358,00
*/