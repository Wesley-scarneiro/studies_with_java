/*
 * Escreva um programa que efetue a leitura de um valor N e obtenha o seu fatorial.
 * Construa uma fun��o que realize o c�lculo do faturial com recurs�o e outra com itera��o.
 */
package studies_with_java.capitulo2_exercicios;

import java.util.Scanner;

public class Exercicio13_fatorial {
	
	/*
	 * Calcula o fatorial de N usando recurs�o.
	 */
	public static long fatorial1(long n) {
		
		if (n == 0 || n == 1) return 1;
		else return (n * fatorial1(n-1));
	}
	
	/*
	 * Calcula o fatorial de N usando itera��o.
	 * Usa o operador tern�rio para a atribui��o inicial da vari�vel "fatorial".
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
			
			System.out.print("Informe um n�mero inteiro positivo para o c�lculo do fatorial: ");
			fatorial = in.nextInt();
			if (fatorial > 0) System.out.println(fatorial + "! = " + fatorial2(fatorial));
			else System.out.println("Inteiro negativo.");
			in.close();
			
		} catch(Exception e) {
			
			System.out.println("Entrada inv�lida.");
		}
	}

}
