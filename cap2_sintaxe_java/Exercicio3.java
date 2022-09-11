/*
 *  Escreva um programa que efetue a leitura de um valor inteiro e outro real, exibindo-os no console. 
 */

package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	
	/*
	 * Exibe a leitura de um n�mero inteiro e outro real.
	 */
	public static void imprimir(int x, double y) {
		
		System.out.println("Numero inteiro lido: " + x + "\nNumero real lido: " + y);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		double y = 0;
		
		try {
			
			System.out.print("Informe um n�mero inteiro: ");
			x = in.nextInt();
			System.out.print("Informe um n�mero real: ");
			y = in.nextDouble();

		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.");
			
		} finally {
			
			in.close();
		}
		
		imprimir(x, y);
	}

}
