/*
 * Escreva um programa que leia N valores inteiros, em que N � determinado pelo usu�rio no in�cio
 * do programa. Os valores devem ser ent�o apresentados na ordem como foram fornecidos em um array e, depois,
 * reapresentados em ordem crescente em outro array. Finalmente, o programa deve indicar se a sequ�ncia inicial de valores
 * estava ou n�o em ordem crescente.
 * Construa os algoritmos necess�rios para a c�pia dos arrays, verifica��o da ordena��o inicial, ordena��o do array
 * e impress�o para resolver o problema, sem recorrer a bibliotecas do Java.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio15 {
	
	/*
	 * Fun��o para copiar os elementos de um arranjo A para um arranjo B, de mesmo tamanho.
	 * Retorna uma refer�ncia.
	 */
	public static int [] copiar(int[] array1) {
		
		int [] copia = new int[array1.length];
		for (int i = 0; i < copia.length; ++i) copia[i] = array1[i];
		return copia;
	}
	
	/*
	 * Fun��o que verifica se uma sequ�ncia de n�meros est� ordenada no arranjo.
	 * Se um elemento na posi��o "i" � maior que o da posi��o "i+1", ent�o o
	 * arranjo n�o est� ordenado. 
	 */
	public static boolean verificarOrdenacao(int[] array) {
		
		boolean ordenado = true;
		
		for (int i = 0; i < array.length - 1; ++i) {
			
			if (array[i] > array[i+1]) {
				
				ordenado = false;
				break;
			}
		}
		
		return ordenado;
	}
	
	/*
	 * Fun��o que ordena um arranjo utilizando o algoritmo Bubble Sort.
	 * Pega o primeiro maior elemento e o coloca na �ltima posi��o, depois o
	 * segungo maior elemento na pen�ltima posi��o e assim sucessivamente.
	 */
	public static void ordenar(int[] array) {
		
		int temp;
		
		for (int i = array.length-1; i > 0; --i) {
			
			for (int j = 0; j < i; ++j) {
				
				if (array[i] < array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	/*
	 * Imprime um arranjo.
	 */
	public static void imprimir(int[] array) {
		
		System.out.print("[");
		for (int i = 0; i < array.length; ++i) {
			
			if (i != array.length-1) System.out.print(array[i] + ", ");
			else System.out.print(array[i] + "]\n");
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		boolean ordenacao;
		
		try {
			
			System.out.print("Quantos inteiros ser�o informados? ");
			n = in.nextInt();
			
			if (n > 0) {
				
				System.out.println("Informe os " + n + " inteiros: ");
				int [] original = new int[n];
				for (int i = 0; i < n; ++i) original[i] = in.nextInt();
				imprimir(original);
				ordenacao = verificarOrdenacao(original);
				
				if (ordenacao) {
					
					System.out.println("A sequ�ncia informada est� ordenada.");
				}
				else {
					
					System.out.println("A sequ�ncia informada n�o est� ordenada.");
					int[] copia = copiar(original);
					ordenar(copia);
					imprimir(copia);
				}
			}
			else {
				
				System.out.println("O n�mero deve ser diferente e maior que zero!");
			}
			
		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.");
		}
	}

}
/*
Quantos inteiros ser�o informados? 5
Informe os 5 inteiros: 
-1
-3
2
5
6
[-1, -3, 2, 5, 6]
A sequ�ncia informada n�o est� ordenada.
[-3, -1, 2, 5, 6]
*/
