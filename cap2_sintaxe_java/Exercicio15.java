/*
 * Escreva um programa que leia N valores inteiros, em que N é determinado pelo usuário no início
 * do programa. Os valores devem ser então apresentados na ordem como foram fornecidos em um array e, depois,
 * reapresentados em ordem crescente em outro array. Finalmente, o programa deve indicar se a sequência inicial de valores
 * estava ou não em ordem crescente.
 * Construa os algoritmos necessários para a cópia dos arrays, verificação da ordenação inicial, ordenação do array
 * e impressão para resolver o problema, sem recorrer a bibliotecas do Java.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio15 {
	
	/*
	 * Função para copiar os elementos de um arranjo A para um arranjo B, de mesmo tamanho.
	 * Retorna uma referência.
	 */
	public static int [] copiar(int[] array1) {
		
		int [] copia = new int[array1.length];
		for (int i = 0; i < copia.length; ++i) copia[i] = array1[i];
		return copia;
	}
	
	/*
	 * Função que verifica se uma sequência de números está ordenada no arranjo.
	 * Se um elemento na posição "i" é maior que o da posição "i+1", então o
	 * arranjo não está ordenado. 
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
	 * Função que ordena um arranjo utilizando o algoritmo Bubble Sort.
	 * Pega o primeiro maior elemento e o coloca na última posição, depois o
	 * segungo maior elemento na penúltima posição e assim sucessivamente.
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
			
			System.out.print("Quantos inteiros serão informados? ");
			n = in.nextInt();
			
			if (n > 0) {
				
				System.out.println("Informe os " + n + " inteiros: ");
				int [] original = new int[n];
				for (int i = 0; i < n; ++i) original[i] = in.nextInt();
				imprimir(original);
				ordenacao = verificarOrdenacao(original);
				
				if (ordenacao) {
					
					System.out.println("A sequência informada está ordenada.");
				}
				else {
					
					System.out.println("A sequência informada não está ordenada.");
					int[] copia = copiar(original);
					ordenar(copia);
					imprimir(copia);
				}
			}
			else {
				
				System.out.println("O número deve ser diferente e maior que zero!");
			}
			
		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
		}
	}

}
/*
Quantos inteiros serão informados? 5
Informe os 5 inteiros: 
-1
-3
2
5
6
[-1, -3, 2, 5, 6]
A sequência informada não está ordenada.
[-3, -1, 2, 5, 6]
*/
