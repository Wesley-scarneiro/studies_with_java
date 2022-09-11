/*
 * Escreva um programa que efetue a leitura de um valor inteiro N, determinando se ele é par ou ímpar.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		
		try {
			
			System.out.println("Informe um número inteiro: ");
			x = in.nextInt();
			if (x % 2 == 0) System.out.println(x + " é par.");
			else System.out.println(x + " é ímpar.");
			
		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
			
		} finally {
			
			in.close();
		}
	}
}
