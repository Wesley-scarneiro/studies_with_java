/*
 * Escreva um programa que efetue a leitura de um valor inteiro N, determinando se ele � par ou �mpar.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		
		try {
			
			System.out.println("Informe um n�mero inteiro: ");
			x = in.nextInt();
			if (x % 2 == 0) System.out.println(x + " � par.");
			else System.out.println(x + " � �mpar.");
			
		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.");
			
		} finally {
			
			in.close();
		}
	}
}
