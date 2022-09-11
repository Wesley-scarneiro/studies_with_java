/*
 * Construa um programa que efetue a leitura de um valor inteiro N, imprimindo no console uma contagem de 0 até N (inclusive). 
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		
		try {
			
			System.out.print("Informe um número inteiro: ");
			x = in.nextInt();
			
			for (int i = 0; i <= x; i++) {
				
				if (i == x) System.out.print(i + ".");
				else System.out.print(i + ", ");
			}
			
		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
			
		} finally {
			
			in.close();
		}
	}

}
/*
Informe um número inteiro: 10
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
 */
