/*
 * Escreva um programa que efetue a leitura de 3 n�meros reais R, S e T, imprimindo qual deles � o maior.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double [] array = new double[3];
		
		try {
			
			System.out.println("Informe 3 n�meros reais: ");
			
			for (int i = 0; i < 3; i++) {
				
				System.out.print("[" + (i+1) + "] = ");
				array[i] = in.nextDouble();
				
			}
			
			double max = (array[0] > array[1]) ? array[0] : array[1];
			max = (max > array[2]) ? max : array[2];
			System.out.println("O maior elemento � o \"" + max + "\"" );
			
		} catch (Exception e) {
			
			System.out.println("Entrada inv�lida.\nPrograma encerrado.");
		}
	}

}
