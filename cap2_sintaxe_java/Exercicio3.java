/*
 *  Escreva um programa que efetue a leitura de um valor inteiro e outro real, exibindo-os no console. 
 */

package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	
	/*
	 * Exibe a leitura de um número inteiro e outro real.
	 */
	public static void imprimir(int x, double y) {
		
		System.out.println("Numero inteiro lido: " + x + "\nNumero real lido: " + y);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		double y = 0;
		
		try {
			
			System.out.print("Informe um número inteiro: ");
			x = in.nextInt();
			System.out.print("Informe um número real: ");
			y = in.nextDouble();

		} catch (Exception e) {
			
			System.out.println("Entrada inválida.");
			
		} finally {
			
			in.close();
		}
		
		imprimir(x, y);
	}

}
