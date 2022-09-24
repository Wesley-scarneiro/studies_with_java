/*
 * Escreva um programa que efetue a leitura de um valor N e obtenha o seu fatorial.
 * Construa uma função que realize o cálculo do faturial com recursão e outra com iteração.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio13_fatorial {
	
	/*
	 * Calcula o fatorial de N usando recursão.
	 */
	public static long fatorial1(long n) {
		
		if (n == 0 || n == 1) return 1;
		else return (n * fatorial1(n-1));
	}
	
	/*
	 * Calcula o fatorial de N usando iteração.
	 * Usa o operador ternário para a atribuição inicial da variável "fatorial".
	 */
	public static long fatorial2(long n) {
		
		long fatorial = (n == 0 || n == 1) ? 1 : n;
		
		while (n > 2) {
			
			--n;
			fatorial *= n;
		}
		
		return fatorial;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int fatorial;
		
		try {
			
			System.out.print("Informe um número inteiro positivo para o cálculo do fatorial: ");
			fatorial = in.nextInt();
			if (fatorial > 0) System.out.println(fatorial + "! = " + fatorial2(fatorial));
			else System.out.println("Inteiro negativo.");
			in.close();
			
		} catch(Exception e) {
			
			System.out.println("Entrada inválida.");
		}
	}

}
