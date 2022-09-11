/*
 * 	Exemplos de uso de arranjos e matrizes no Java.
 */
package studies_with_java.capitulo2_sintaxeJava;

import java.util.Arrays;
import java.util.Random;

public class ArranjosMatrizes {
	
	/*
	 * Função que gera "n" número aleatórios, com limite em 100, e os guarda em um array.
	 * Os elementos guardados são somados e depois impressos. 
	 * Utiliza a biblioteca Random para gerar inteiros aleatórios.
	 */
	public static void exemplo1(int n) {
		
		Random random = new Random();
		int [] numeros = new int[n];
		int aleatorio;
		
		for (int i = 0; i < numeros.length; i++) {
			
			aleatorio = random.nextInt(100);
			numeros[i] = aleatorio;
			System.out.println("[" + i + "] = " + aleatorio);
		}
		
		int soma = 0;
		for (int e : numeros) {
			
			soma += e;
		}
		
		System.out.println("Soma dos elementos = " + soma);
	}
	
	/*
	 *	Imprimindo um array diretamente com o método toString.
	 *	Utiliza a classe Arrays para chamar o método toString.
	 */
	public static void exemplo2(double [] array) {
		
		System.out.println("Elementos do array: " + Arrays.toString(array));
	}
	
	/*
	 * Adaptado para chamada com arrays do tipo int.
	 */
	public static void exemplo2(int [] array) {
		
		System.out.println("Elementos do array: " + Arrays.toString(array));
		System.out.println("Tamanho: " + array.length);
	}
	
	/*
	 * Cria um arranjo de tamanho "n" e o popula com uma constante real.
	 * Reliza a chamada do método fill(), da classe Arrays, e da classe Random, para gerar a constante (com limite em 10).
	 * Chama a função exemplo2(), para imprimir. 
	 */
	public static void exemplo3(int n) {
		
		Random random = new Random();
		double [] array = new double[n];
		Arrays.fill(array, random.nextDouble(10)); // popula o array com uma constante randômica. 
		exemplo2(array);
	}
	
	/*
	 * 	Função que verifica se dois arrays são iguais.
	 * 	Esta função simula um pouco sobre como seria a implementação do método equals da classe Arrays.
	 * 	Função para adaptada para não gerar retornos. 
	 */
	public static void exemplo4(int [] array1, int [] array2) {
		
		boolean resultado = true;
		
		// Tamanhos diferentes, não são iguais.
		if (array1.length != array2.length) {
			
			resultado = false;
		}
		else {
			
			// Comparando cada elemento.
			for (int i = 0; i < array1.length; i++) {
				
				if (array1[i] != array2[i]) {
					
					resultado = false;
					break;
				}
			}
		}
		
		if (resultado == true) System.out.println("Os arrays são iguais.");
		else System.out.println("Os arrays são diferentes: Possuem tamanhos ou elementos diferentes.");
	}
	
	/*
	 * 	Método que recebe um array de tamanho "n" e o expande para um array de tamanho "m", tal que, m > n.
	 * 	Os elementos originais do array são repassados para o novo array expandido.
	 * 	Retorna a referência do array expandido ou a do array original (caso m == n).
	 */
	public static int [] expandirArray(int [] array1, int m) {
		
		if (array1.length == m) {
			
			return array1;
		}
		else {
			
			int [] array2 = new int[m];
			for (int i = 0; i <array1.length; i++) array2[i] = array1[i];
			return array2;
		}
	}
	
	/*
	 * Popula um array com números aleatórios de 1 a 100.
	 */
	public static void popular(int array[]) {
		
		Random random = new Random();
		for (int i = 0; i < array.length; i++) array[i] = random.nextInt(100);
	}
	
	/*
	 * Simula o funcionamento do método copyOf() da classe Arrays.
	 * Recebe array1, array2 e um inteiro n.
	 * Copia os "n" primeiros elementos de array1 para as "n" primeiras posições de array2.
	 * Se supõe que array2.length é maior ou igual a array1.length.
	 * Também imprime o estado inicial e final dos arrays.
	 */
	public static void exemploCopyOf(int [] array1, int [] array2, int n) {
		
		System.out.println("Estado inicial:");
		System.out.println("Array1 -> " + Arrays.toString(array1));
		System.out.println("Array2 -> " + Arrays.toString(array2));

		for (int i = 0; i < n; i++) {
			
			array2[i] = array1[i];
		}
		
		System.out.println("Estado final:");
		System.out.println("Array1 -> " + Arrays.toString(array1));
		System.out.println("Array2 -> " + Arrays.toString(array2));
	}
	
	/*
	 * Simula o funcionamento do método copyOfRange() da classe Arrays.
	 * Recebe array1, array2, e um inteiro m e n. 
	 * Copia os elementos de "m" até "n" de array1 para as "n-m" primeiras posições do array2.
	 * Se supõe que array2.length é maior ou igual a array1.length.
	 * Também imprime o estado inicial e final dos arrays.
	 */
	public static void exemploCopyOfRange(int [] array1, int [] array2, int m, int n) {
		
		System.out.println("Estado inicial:");
		System.out.println("Array1 -> " + Arrays.toString(array1));
		System.out.println("Array2 -> " + Arrays.toString(array2));
		
		for (int i = m, j = 0; i < n; i++, j++) {
			
			array2[j] = array1[i];
		}
		
		System.out.println("Estado final:");
		System.out.println("Array1 -> " + Arrays.toString(array1));
		System.out.println("Array2 -> " + Arrays.toString(array2));
	}
	
	/*
	 * Método para popular uma matriz com números aleatórios.
	 * Imprime a matriz ao final.
	 */
	public static void popularMatriz(int [][] m) {
		
		Random random = new Random();
		for (int i = 0; i < m.length; i++) {			// m.length retorna a quantidades de linhas (ponteiros) da matriz.
			
			for (int j = 0; j < m[i].length; j++) {		// m[i].length retorna a quantidade de colunas, subarray do ponteiro "i".
				
				m[i][j] = random.nextInt(50);
			}
		}
	}
	/*
	 * Imprime os elementos de uma matriz.
	 */
	public static void imprimirMatriz(int [][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				System.out.print(m[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}
	
	/*
	 * Imprime os elementos de uma matriz.
	 * Utiliza o for each para imprimir os elementos.
	 */
	public static void imprimirMatriz2(int [][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j : m[i]) {
				
				System.out.print(j + "\t");
			}
			
			System.out.println();
		}
	}
	
	/*
	 * Método para copiar uma matriz de tamanho "t" de duas formas diferentes.
	 * A primeira percorre a matriz variando linhas e colunas.
	 * Na segunda percorre a matriz variando colunas e linhas.
	 * É mais eficiente percorrer variando linhas e colunas, devido a influência da memória cache.
	 */
	public static void percorrerMatriz(int t) {
		
		int m[][] = new int[t][t];
		int copia [][]= new int[t][t];
		popularMatriz(m);

		long inicio, fim;
		
		System.out.println("Matriz de tamanho " + t + ".");
		
		// Variando linhas --> Colunas
		System.out.println("Percorrendo com variação das linhas --> colunas.");
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				copia[i][j] = m[i][j];
			}
		}
		
		fim = System.currentTimeMillis();
		System.out.println("\tTempo total = " + (fim-inicio) + "ms");
		
		// Variando colunas --> linhas
		inicio = 0; fim = 0;
		System.out.println("Percorrendo com variação das colunas --> linhas.");
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < t ; i++) {
			
			for (int j = 0; j < t; j++) {
				
				copia[i][j] = m[j][i];
			}
		}
		
		fim = System.currentTimeMillis();
		System.out.println("\tTempo total = " + (fim-inicio) + "ms");
	}
	
	public static void main(String[] args) {
		
		// exemplo1(10);
		
		// double [] array = {3.14, 2.78, 1.999, 5.73, 2};
		// exemplo2(array);
		
		// exemplo3(10);
		
		/* int [] array1 = {1, 2, 3, 4, 5, 6};
		int [] array2 = {1, 2, 3, 4, 5, 6};
		int [] array3 = {1, 2, 3, 4, 5};
		int [] array4 = {1, 2, 3, 4, 5, 7};
		exemplo4(array1, array2);
		exemplo4(array1, array3);
		exemplo4(array1, array4);	*/
		
		/*
		int array[] = new int[10];
		popular(array);
		exemplo2(array);
		array = expandirArray(array, 20);
		exemplo2(array);	*/
		
		/*
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		popular(array1);
		exemploCopyOf(array1, array2, 5);*/
		
		/*
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		popular(array1);
		exemploCopyOfRange(array1, array2, 5, 10);*/
		
		/*
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		popular(array1);
		popular(array2);
		System.out.println("Desordenado -> " + Arrays.toString(array1));
		Arrays.sort(array1); 												// Ordenação com o QuickSort!
		System.out.println("Ordenado -> " + Arrays.toString(array1));
		System.out.println("Total desordenado -> " + Arrays.toString(array2));
		Arrays.sort(array2, 0, 5);
		System.out.println("Metade ordenado -> " + Arrays.toString(array2)); */
		
		
		/*int [][] matriz = new int[5][5];
		popularMatriz(matriz);
		imprimirMatriz(matriz);
		imprimirMatriz2(matriz);*/
		
		//percorrerMatriz(10000);

	}

}
